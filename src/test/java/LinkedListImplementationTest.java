    import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;

import Assignment1.LinkedLists.LinkedListImplementation.LinkedList;

public class LinkedListImplementationTest {

	
	@Test
	public void pushfrontbackTest() {
			    
		LinkedList list=new LinkedList();
		list.pushFront(4);
		list.pushFront(1);
		list.pushFront(2);
		list.pushBack(5);
		list.pushBack(8);
		list.pushBack(6);
//		while(list.)
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		ByteArrayOutputStream errContent = new ByteArrayOutputStream();
		PrintStream originalOut = System.out;
		PrintStream originalErr = System.err;

		System.setOut(new PrintStream(outContent));
	    System.setErr(new PrintStream(errContent));
		list.display();
		assertEquals("LinkedList : [ 2 1 4 5 8 6 ]\r\n"
				, outContent.toString());
		
		System.setOut(originalOut);
	    System.setErr(originalErr);
		
		try {
			list.popFront();
			list.popFront();
			list.popFront();
			list.popFront();
			list.popFront();
			list.popFront();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	@Test
	public void addTest() {
			    
		LinkedList list=new LinkedList();
		list.add(0);
		list.add(1);
		list.add(2);
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		ByteArrayOutputStream errContent = new ByteArrayOutputStream();
		PrintStream originalOut = System.out;
		PrintStream originalErr = System.err;

		System.setOut(new PrintStream(outContent));
	    System.setErr(new PrintStream(errContent));

		list.display();
		assertEquals("LinkedList : [ 0 1 2 ]\r\n"
				, outContent.toString());
		System.setOut(originalOut);
	    System.setErr(originalErr);
	    try {
			list.popFront();
			list.popFront();
			list.popFront();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test
	public void topFrontBackTest() {
			    
		LinkedList list=new LinkedList();
		list.pushBack(0);
		list.pushBack(1);
		list.pushBack(2);

		int x=-1;
		try {
			x = list.topFront();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		assertEquals(x,0);
		int x1=-1;
	    try {
			x1=list.topBack();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	    assertEquals(x1, 2);
		try {
			list.popFront();
			list.popFront();
			list.popFront();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
//	@Test
//	public void popFrontBackTest() {
//			    
//		LinkedList list=new LinkedList();
//		list.pushBack(0);
//		list.pushBack(1);
//		list.pushBack(2);
//		list.pushBack(3);
//		list.popFront();
//		list.popBack();
//		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
//		ByteArrayOutputStream errContent = new ByteArrayOutputStream();
//		PrintStream originalOut = System.out;
//		PrintStream originalErr = System.err;
//
//		System.setOut(new PrintStream(outContent));
//	    System.setErr(new PrintStream(errContent));
//
//		list.display();
//		assertEquals("LinkedList : 1 2 \r\n"
//				, outContent.toString());
//		System.setOut(originalOut);
//	    System.setErr(originalErr);
//	}
//	@Test
//	public void popTest() {
//			    
//		LinkedList list=new LinkedList();
//		list.pushBack(0);
//		list.pushBack(1);
//		list.pushBack(2);
//		list.pushBack(3);
//		list.pop(3);
//		list.pop(1);
//		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
//		ByteArrayOutputStream errContent = new ByteArrayOutputStream();
//		PrintStream originalOut = System.out;
//		PrintStream originalErr = System.err;
//
//		System.setOut(new PrintStream(outContent));
//	    System.setErr(new PrintStream(errContent));
//
//		list.display();
//		assertEquals("LinkedList : 0 2 \r\n"
//				, outContent.toString());
//		System.setOut(originalOut);
//	    System.setErr(originalErr);
//	}
}
