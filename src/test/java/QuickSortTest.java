import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class QuickSortTest {
    SortingInterface sorter = new QuickSort();

    @Test
    public void sortMoreThan20Values() {
        double[] input = {11.3, 128, 231, 0.3, -23, 38.5, 128, 12, 15, 22.1, 1, 2, 4, 10, 76, 43, 22, 30, 0, 0, 1.2};
        double[] output = sorter.sort(input);
        double[] correctOutput = {-23, 0, 0, 0.3, 1, 1.2, 2, 4, 10, 11.3, 12, 15, 22, 22.1, 30, 38.5, 43, 76, 128, 128, 231};
        assertArrayEquals(output, correctOutput, 0);
    }

    @Test
    public void sortLessThan20Values(){
        double[] input = {11.3, 128, 231, 0.3, -23, 128, 12};
        double[] output = sorter.sort(input);
        double[] correctOutput = {-23, 0.3, 11.3, 12, 128, 128, 231};
        assertArrayEquals(output, correctOutput, 0);
    }

}
