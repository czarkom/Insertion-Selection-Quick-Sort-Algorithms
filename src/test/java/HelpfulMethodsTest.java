import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class HelpfulMethodsTest {
    @Test
    public void swapTest() {
        double[] vector1 = {1, 2};
        double[] vector2 = {2, 1};
        HelpfulMethods.swap(vector1, 0, 1);
        assertArrayEquals(vector1, vector2, 0);
    }
}