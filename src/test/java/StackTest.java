import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class StackTest {
    Stack<Integer> stack = new Stack<>();

    @Test
    public void pushAndPopTest() {
        stack.push(123);
        stack.push(102);
        assertEquals(102, (int) stack.pop());
    }

    @Test
    public void isStackEmpty() {
        stack.push(10);
        stack.pop();
        assertTrue(stack.isStackEmpty());
    }

    @Test(expected = IllegalStateException.class)
    public void testEmptyStackException() {
        stack.push(0);
        stack.pop();
        stack.pop();
    }
}