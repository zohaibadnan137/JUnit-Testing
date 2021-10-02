package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.LinkedList;

class LinkedListTest {
	private LinkedList objListUnderTest;
	
	@BeforeEach
	public void setUp()
	{
		objListUnderTest = new LinkedList();
	}
	
	@Test
	public void listTestOne() // Insertion Test 1
	{
		// Push values at the front of the list
		objListUnderTest.pushFront(1);
		objListUnderTest.pushFront(2);
		objListUnderTest.pushFront(3);
		objListUnderTest.pushFront(4);
		objListUnderTest.pushFront(5);
		
		// Compare the values
		LinkedList.Node temp = objListUnderTest.head;
		int num = 5;
		while(temp.next != null)
		{
			assertEquals(temp.key, num);
			num--;
			temp = temp.next;
		}
	}

	@Test
	public void listTestTwo() // Insertion Test 2
	{
		// Push values at the back of the list
		objListUnderTest.pushBack(1);
		objListUnderTest.pushBack(2);
		objListUnderTest.pushBack(3);
		objListUnderTest.pushBack(4);
		objListUnderTest.pushBack(5);
		
		// Compare the values
		LinkedList.Node temp = objListUnderTest.head;
		int num = 1;
		while(temp.next != null)
		{
			assertEquals(temp.key, num);
			num++;
			temp = temp.next;
		}
	}

	@Test
	public void listTestThree() // Deletion Test 1
	{
		// Push values at the front of the list
		objListUnderTest.pushFront(1);
		objListUnderTest.pushFront(2);
		objListUnderTest.pushFront(3);
		objListUnderTest.pushFront(4);
		objListUnderTest.pushFront(5);
		
		// Delete value at the front of the list
		objListUnderTest.popFront();
		
		// Compare the values
		LinkedList.Node temp = objListUnderTest.head;
		int num = 4;
		while(temp.next != null)
		{
			assertEquals(temp.key, num);
			num--;
			temp = temp.next;
		}
	}	

	@Test
	public void listTestFour() // Deletion Test 2
	{
		// Push values at the back of the list
		objListUnderTest.pushBack(1);
		objListUnderTest.pushBack(2);
		objListUnderTest.pushBack(3);
		objListUnderTest.pushBack(4);
		objListUnderTest.pushBack(5);
		
		// Delete value at the back of the list
		objListUnderTest.popBack();
		
		// Compare the values
		LinkedList.Node temp = objListUnderTest.head;
		int num = 1;
		while(temp.next != null)
		{
			assertEquals(temp.key, num);
			num++;
			temp = temp.next;
		}
	}
}
