import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import javax.print.attribute.standard.PrinterInfo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Assignment1.Array.Array;
import Assignment1.Array.ArrayDeletion;
import Assignment1.Array.ArrayInsertion;

public class ArrayTest {

	@Test
	public void insertionTest() {
		Array arr=new Array();
		arr.insert(6, 0);
		arr.insert(3, 1);
		arr.insert(4, 2);
		arr.insert(8, 3);
		arr.insert(9, 4);
		assertEquals(arr.linearSearch(6),true);
		assertEquals(arr.linearSearch(4),true);
		assertEquals(arr.binarySearch(3,0,6),true);
		assertEquals(arr.binarySearch(8,0,5),true);
		assertNotEquals(arr.binarySearch(8,4,0),true);
	}
	@Test
	public void DeleteTest() {
		Array arr=new Array();
		arr.insert(6, 0);
		arr.insert(3, 1);
		arr.insert(4, 2);
		arr.insert(8, 3);
		arr.insert(9, 2);
//		int[] arr1= {3,4,6,8};
		arr.delete(2);
		assertEquals(arr.linearSearch(9),false);
		assertNotEquals(arr.linearSearch(9),true);
//		assertEquals(arr.linearSearch(4),true);
//		assertEquals(arr.linearSearch(8),true);
	}
	
	
	@Test
	public void SortTest() {
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		ByteArrayOutputStream errContent = new ByteArrayOutputStream();
		PrintStream originalOut = System.out;
		PrintStream originalErr = System.err;

		System.setOut(new PrintStream(outContent));
	    System.setErr(new PrintStream(errContent));

		Array arr=new Array();
		arr.insert(6, 0);
		arr.insert(3, 1);
		arr.insert(4, 2);
		arr.insert(8, 3);
		arr.bubbleSort();
		arr.display();
	
		assertEquals("3 4 6 8 \r\n", outContent.toString());
		System.setOut(originalOut);
	    System.setErr(originalErr);
	}
	@Test
	public void ArrayDeleteTest() {
		ArrayDeletion arr=new ArrayDeletion();
		int [] array = {1,2,3,4,5,6};
		arr.delete(array,2);
		
		boolean flag=true;
		for (int i = 0; i < array.length; i++) {
			if(array[i]==2) {
				flag=false;
			}
			
		}
		assertEquals(flag,false);
		
	}
	@Test
	public void ArrayInsertionTest() {
		ArrayInsertion arr=new ArrayInsertion();
		int [] array = new int[5];
		arr.insert(array,1,0);
		arr.insert(array,2,1);
		arr.insert(array,3,2);
		arr.insert(array,4,3);
		boolean flag=false;
		
		if(array[0]==1) {
			flag=true;
		}
		assertEquals(flag,true);
		flag=false;
		
		if(array[3]==4) {
			flag=true;
		}
		assertEquals(flag,true);
		
		
	}
	@Test
	public void DisplayTest() {
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		ByteArrayOutputStream errContent = new ByteArrayOutputStream();
		PrintStream originalOut = System.out;
		PrintStream originalErr = System.err;

		System.setOut(new PrintStream(outContent));
	    System.setErr(new PrintStream(errContent));
	    int[] array= {1,3,4,6,8};
		ArrayDeletion arr=new ArrayDeletion();
		arr.delete(array, 0);
		
		arr.display(array);
		assertEquals("3 4 6 8 -1 \r\n", outContent.toString());
		System.setOut(originalOut);
	    System.setErr(originalErr);		
		
	}
}
