public class SelectionSort implements SortingInterface {
    @Override
    public double[] sort(double[] unsortedVector) {
        if (unsortedVector == null || unsortedVector.length < 1)
            throw new IllegalArgumentException("Please give me normal array");
        double[] output = unsortedVector.clone();
        for (int i = output.length - 1; i >= 1; i--) {
            int max = findMaxValueIndex(output, i);
            if (max != i) {
                HelpfulMethods.swap(output, max, i);
            }
        }
        return output;
    }

    private int findMaxValueIndex(double[] vector, int lastIndex) {
        int maxValueIndex = 0;
        for (int i = 1; i <= lastIndex; i++) {
            if (vector[i] > vector[maxValueIndex]) maxValueIndex = i;
        }
        return maxValueIndex;
    }
}
