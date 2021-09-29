import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;

import Assignment1.LinkedLists.CircularLinkedList.CircularLinkedList;

public class CircularListTests {

	@Test
	public void pushfrontTest() {
			    
		CircularLinkedList list=new CircularLinkedList();
		list.pushFront(0);
		list.pushFront(1);
		list.pushFront(2);
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		ByteArrayOutputStream errContent = new ByteArrayOutputStream();
		PrintStream originalOut = System.out;
		PrintStream originalErr = System.err;

		System.setOut(new PrintStream(outContent));
	    System.setErr(new PrintStream(errContent));

		list.display();
		assertEquals("List : 2 1 0\r\n"
				, outContent.toString());
		System.setOut(originalOut);
	    System.setErr(originalErr);
	}
	@Test
	public void pushBackTest() {
			    
		CircularLinkedList list=new CircularLinkedList();
		list.pushBack(0);
		list.pushBack(1);
		list.pushBack(2);
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		ByteArrayOutputStream errContent = new ByteArrayOutputStream();
		PrintStream originalOut = System.out;
		PrintStream originalErr = System.err;

		System.setOut(new PrintStream(outContent));
	    System.setErr(new PrintStream(errContent));

		list.display();
		assertEquals("List : 0 1 2\r\n"
				, outContent.toString());
		System.setOut(originalOut);
	    System.setErr(originalErr);
	}
	@Test
	public void popFrontBackTest() {
			    
		CircularLinkedList list=new CircularLinkedList();
		list.pushBack(0);
		list.pushBack(1);
		list.pushBack(2);
		list.pushBack(3);
		list.popFront();
		list.popBack();
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		ByteArrayOutputStream errContent = new ByteArrayOutputStream();
		PrintStream originalOut = System.out;
		PrintStream originalErr = System.err;

		System.setOut(new PrintStream(outContent));
	    System.setErr(new PrintStream(errContent));

		list.display();
		assertEquals("List : 1 2\r\n"
				, outContent.toString());
		System.setOut(originalOut);
	    System.setErr(originalErr);
	}

}
