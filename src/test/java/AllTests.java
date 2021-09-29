import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ ArrayTest.class, CircularListTests.class, DequeueTest.class, LinkedListImplementationTest.class,
		LinkedListSwapNodeTests.class, LinkedListTest.class, QueueArrayTest.class, QueueImplementationTest.class,
		QueueTest.class, StackArrayTest.class, StackImplementationTest.class, StackLinkedListTest.class })
public class AllTests {

}
