import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.assertArrayEquals;

public class SelectionSortTest {
    SortingInterface sorter = new SelectionSort();

    @Test(expected = IllegalArgumentException.class)
    public void isExceptionForEmptyArrayThrownCorrectly() {
        double input[] = {};
        sorter.sort(input);
    }

    @Test(expected = IllegalArgumentException.class)
    public void isExceptionForNullArgumentThrownCorrectly() {
        sorter.sort(null);
    }

    @Test
    public void sortOneElementArray() {
        double[] input = {-23};
        double[] output = sorter.sort(input);
        double[] correctOutput = {-23};
        assertArrayEquals(output, correctOutput, 0);
    }

    @Test
    public void sort() {
        double[] input = {11.3, 128, 231, 0.3, -23, 128, 12};
        double[] output = sorter.sort(input);
        double[] correctOutput = {-23, 0.3, 11.3, 12, 128, 128, 231};
        assertArrayEquals(output, correctOutput, 0);
    }

    @Test
    public void universalCaseTime() {
        long startTime, endTime, sum, duration, average;
        Random r = new Random();
        int attempts = 80;
        for (int i = 1000; i < 100000; i += 2000) {
            double[] input = new double[i];
            for (int j = 0; j < input.length; j++) {
                input[j] = Math.round(r.nextDouble() * 100000);
            }
            sum = 0;
            for (int k = 0; k < attempts; k++) {
                startTime = System.nanoTime();
                sorter.sort(input);
                endTime = System.nanoTime();
                duration = endTime - startTime;
                sum += duration;
            }
            average = sum / attempts;
            System.out.println(i + "\t" + average);
        }

    }
}