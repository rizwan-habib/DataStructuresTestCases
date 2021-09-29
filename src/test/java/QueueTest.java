import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;

import Assignment1.Queue.QueuewithLinkedList.Queue;

public class QueueTest {

	@Test
	public void EnqueueTest() {
		Queue que=new Queue();
		que.enqueue(0);
		que.enqueue(1);
		que.enqueue(2);
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		ByteArrayOutputStream errContent = new ByteArrayOutputStream();
		PrintStream originalOut = System.out;
		PrintStream originalErr = System.err;

		System.setOut(new PrintStream(outContent));
	    System.setErr(new PrintStream(errContent));

		que.display();
		assertEquals("Queue : 0 1 2 \r\n"
				, outContent.toString());
		System.setOut(originalOut);
	    System.setErr(originalErr);
	}
	@Test
	public void dequeueTest() {
		Queue que=new Queue();
		que.enqueue(0);
		que.enqueue(1);
		que.enqueue(2);
		int x=que.dequeue();
		assertEquals(x,0);

		x=que.dequeue();
		assertEquals(x,1);

		x=que.dequeue();
		assertEquals(x,2);
	}
}
