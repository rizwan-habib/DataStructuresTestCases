import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;

import Assignment1.Queue.DequeueImplementation.Dequeue;

public class DequeueTest {

	@Test
	public void leftRightTest() {
		Dequeue deq=new Dequeue(6);
		deq.addLeft(1);
		deq.addLeft(2);
		deq.addLeft(3);
		deq.addRight(4);
		deq.addRight(5);
		deq.addRight(6);
		deq.addLeft(7);
		deq.addRight(8);
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		ByteArrayOutputStream errContent = new ByteArrayOutputStream();
		PrintStream originalOut = System.out;
		PrintStream originalErr = System.err;

		System.setOut(new PrintStream(outContent));
	    System.setErr(new PrintStream(errContent));

		deq.display();
		assertEquals("DeQueue : 1 2 3 6 5 4 \r\n"
				, outContent.toString());
		System.setOut(originalOut);
	    System.setErr(originalErr);
	}

}
