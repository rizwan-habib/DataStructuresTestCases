import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;

import Assignment1.Stack.StackImplementation.MyStack;

public class StackImplementationTest {

	@Test
	public void pushTest() {
		MyStack stack= new MyStack(3);
		try {
			stack.push(0);
			stack.push(1);
			stack.push(2);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		ByteArrayOutputStream errContent = new ByteArrayOutputStream();
		PrintStream originalOut = System.out;
		PrintStream originalErr = System.err;

		System.setOut(new PrintStream(outContent));
	    System.setErr(new PrintStream(errContent));

		stack.displayStack();
		assertEquals("Stack : [ 0 1 2 ]\r\n"
				, outContent.toString());
		System.setOut(originalOut);
	    System.setErr(originalErr);
	}
	@Test
	public void popTest() {
		MyStack stack= new MyStack(3);
		try {
			stack.push(0);
			stack.push(1);
			stack.push(2);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int x=-1;
		try {
			x = stack.pop();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals(x, 2);
		try {
			x=stack.pop();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals(x, 1);
		try {
			x=stack.pop();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals(x, 0);
		try {
			x=stack.pop();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		assertEquals(x, -1);
	}
	@Test
	public void topTest() {
		MyStack stack= new MyStack(3);
		int x=-1;
		try {
			x = stack.top();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		assertEquals(x, -1);
		try {
			stack.push(0);
			stack.push(1);
			stack.push(2);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			x=stack.top();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals(x, 2);
		assertEquals(stack.size(), 3);
	}
}
