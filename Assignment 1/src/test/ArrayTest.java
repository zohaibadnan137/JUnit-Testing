package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.Array;

public class ArrayTest {
	private Array objArrayUnderTest;
	
	@BeforeEach
	public void setUp() 
	{
		objArrayUnderTest = new Array(); // Create a new array 
	}
	
	@Test
	public void arrayTestOne() // Insertion Test
	{
		// Insert values in the test array 
		objArrayUnderTest.insert(1, 0);
		objArrayUnderTest.insert(2, 1);
		objArrayUnderTest.insert(3, 2);
		objArrayUnderTest.insert(4, 3);
		objArrayUnderTest.insert(5, 4);
		
		// Compare the inserted values 
		assertEquals(objArrayUnderTest.array[0], 1);
		assertEquals(objArrayUnderTest.array[1], 2);
		assertEquals(objArrayUnderTest.array[2], 3);
		assertEquals(objArrayUnderTest.array[3], 4);
		assertEquals(objArrayUnderTest.array[4], 5);
	}
	
	@Test
	public void arrayTestTwo() // Deletion Test 
	{
		// Insert values in the test array 
		objArrayUnderTest.insert(1, 0);
		objArrayUnderTest.insert(2, 1);
		objArrayUnderTest.insert(3, 2);
		objArrayUnderTest.insert(4, 3);
		objArrayUnderTest.insert(5, 4);
		
		// Delete the value at index 2
		objArrayUnderTest.delete(2);
		
		// Compare the final values 
		assertEquals(objArrayUnderTest.array[0], 1);
		assertEquals(objArrayUnderTest.array[1], 2);
		assertEquals(objArrayUnderTest.array[2], 4);
		assertEquals(objArrayUnderTest.array[3], 5);
	}

	@Test
	public void arrayTestThree() // Bubble Sort Test
	{
		// Insert values in the test array 
		objArrayUnderTest.insert(10, 0);
		objArrayUnderTest.insert(12, 1);
		objArrayUnderTest.insert(5, 2);
		objArrayUnderTest.insert(8, 3);
		objArrayUnderTest.insert(1, 4);
		
		// Bubble sort the array 
		objArrayUnderTest.bubbleSort();
		
		// Compare the final values 
		assertEquals(objArrayUnderTest.array[0], 1);
		assertEquals(objArrayUnderTest.array[1], 5);
		assertEquals(objArrayUnderTest.array[2], 8);
		assertEquals(objArrayUnderTest.array[3], 10);
		assertEquals(objArrayUnderTest.array[4], 12);
	}

	@Test
	public void arrayTestFour() // Re-insertion Test 
	{
		// Insert values in the test array 
		objArrayUnderTest.insert(1, 0);
		objArrayUnderTest.insert(2, 1);
		objArrayUnderTest.insert(3, 2);
		objArrayUnderTest.insert(4, 3);
		
		// Insert a new value at previous index 
		objArrayUnderTest.insert(5, 2);
		
		// Compare the inserted values 
		assertEquals(objArrayUnderTest.array[0], 1);
		assertEquals(objArrayUnderTest.array[1], 2);
		assertEquals(objArrayUnderTest.array[2], 5);
		assertEquals(objArrayUnderTest.array[3], 3);
		assertEquals(objArrayUnderTest.array[4], 4);
	}

	@Test
	public void arrayTestFive() // Linear Search Test 1
	{
		// Insert values in the test array 
		objArrayUnderTest.insert(1, 0);
		objArrayUnderTest.insert(2, 1);
		objArrayUnderTest.insert(3, 2);
		objArrayUnderTest.insert(4, 3);
		objArrayUnderTest.insert(5, 4);
		
		// Search the test array for a value that does exist
		boolean result = objArrayUnderTest.linearSearch(4);
		
		assertEquals(result, true);
	}

	@Test
	public void arrayTestSix() // Linear Search Test 2
	{
		// Insert values in the test array 
		objArrayUnderTest.insert(1, 0);
		objArrayUnderTest.insert(2, 1);
		objArrayUnderTest.insert(3, 2);
		objArrayUnderTest.insert(4, 3);
		objArrayUnderTest.insert(5, 4);
		
		// Search the test array for a value that does not exist
		boolean result = objArrayUnderTest.linearSearch(99);
		
		assertEquals(result, false);
	}

	@Test 
	public void arrayTestSeven() // Binary Search Test 1
	{
		// Insert values in the test array 
		objArrayUnderTest.insert(1, 0);
		objArrayUnderTest.insert(2, 1);
		objArrayUnderTest.insert(3, 2);
		objArrayUnderTest.insert(4, 3);
		objArrayUnderTest.insert(5, 4);
		
		// Search the test array for a value that does exist
		boolean result = objArrayUnderTest.binarySearch(4, 0, objArrayUnderTest.size);
		
		assertEquals(result, true);
	}

	@Test
	public void arrayTestEight() // Binary Search Test 2
	{
		// Insert values in the test array 
		objArrayUnderTest.insert(1, 0);
		objArrayUnderTest.insert(2, 1);
		objArrayUnderTest.insert(3, 2);
		objArrayUnderTest.insert(4, 3);
		objArrayUnderTest.insert(5, 4);
		
		// Search the test array for a value that does not exist
		boolean result = objArrayUnderTest.binarySearch(100, 0, objArrayUnderTest.size);
		
		assertEquals(result, false);
	}
	
	@Test
	public void arrayTestNine() // Binary Search Test 3
	{	
		// Search the test array using invalid low and high values
		boolean result = objArrayUnderTest.binarySearch(4, objArrayUnderTest.size, 0);
		
		assertEquals(result, false);
	}

	@Test
	public void arrayTestTen() // Display Test
	{
		// Insert values in the test array 
		objArrayUnderTest.insert(1, 0);
		objArrayUnderTest.insert(2, 1);
		objArrayUnderTest.insert(3, 2);
		objArrayUnderTest.insert(4, 3);
		objArrayUnderTest.insert(5, 4);
		
		objArrayUnderTest.display();
	}
}

