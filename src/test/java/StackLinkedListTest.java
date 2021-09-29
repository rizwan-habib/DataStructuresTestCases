import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;

import Assignment1.Stack.StackwithLinkedList.Stack;

public class StackLinkedListTest {

	@Test
	public void pushTest() {
		Stack stack= new Stack();
		stack.push(0);
		stack.push(1);
		stack.push(2);
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		ByteArrayOutputStream errContent = new ByteArrayOutputStream();
		PrintStream originalOut = System.out;
		PrintStream originalErr = System.err;

		System.setOut(new PrintStream(outContent));
	    System.setErr(new PrintStream(errContent));

		stack.display();
		assertEquals("\r\n"
				+ "Stack \r\n"
				+ "----------\r\n"
				+ "|   2   |\r\n"
				+ "----------\r\n"
				+ "|   1   |\r\n"
				+ "----------\r\n"
				+ "|   0   |\r\n"
				+ "----------\r\n"
				+ "\r\n"
				, outContent.toString());
		System.setOut(originalOut);
	    System.setErr(originalErr);
	}
	@Test
	public void popTest() {
		Stack stack= new Stack();
		stack.push(0);
		stack.push(1);
		stack.push(2);
		int x=stack.pop();
		assertEquals(x, 2);
		x=stack.pop();
		assertEquals(x, 1);
		x=stack.pop();
		assertEquals(x, 0);
		x=stack.pop();
		assertEquals(x, -1);
	}
	@Test
	public void topTest() {
		Stack stack= new Stack();
		int x=stack.top();
		assertEquals(x, -1);
		stack.push(0);
		stack.push(1);
		stack.push(2);
		x=stack.top();
		assertEquals(x, 2);
		assertEquals(stack.getSize(), 3);
	}
}
