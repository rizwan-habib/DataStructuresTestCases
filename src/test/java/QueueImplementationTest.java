import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;

import Assignment1.Queue.QueueImplementation.Queue;

public class QueueImplementationTest {

	@Test
	public void EnqueueTest() {
		Queue que=new Queue(3);
		
		try {
			que.enqueue(0);
			que.enqueue(1);
			que.enqueue(2);
			que.enqueue(3);
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

		que.display();
		assertEquals("Queue : 0 1 2 \r\n"
				, outContent.toString());
		System.setOut(originalOut);
	    System.setErr(originalErr);
	}
	@Test
	public void dequeueTest() {
		Queue que=new Queue(3);
		try {
			que.enqueue(0);
			que.enqueue(1);
			que.enqueue(2);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int x=-1;
		try {
			x = que.dequeue();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals(x,0);

		try {
			x=que.dequeue();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals(x,1);

		try {
			x=que.dequeue();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals(x,2);
		assertEquals(que.size(), 0);
		assertEquals(que.empty(), true);
	}
}
