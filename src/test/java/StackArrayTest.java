import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;

import Assignment1.Stack.StackwithArray.Stack;

public class StackArrayTest {

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
		assertEquals("Stack : 0 1 2 \r\n"
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
	
}
