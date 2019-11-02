public class InsertionSort implements SortingInterface {
    @Override
    public double[] sort(double[] unsortedVector) {
        if (unsortedVector == null || unsortedVector.length < 1)
            throw new IllegalArgumentException("Please give me normal array");
        double[] output = unsortedVector.clone();
        for (int i = 1; i < output.length; i++) {
            double x = output[i];
            int j = i - 1;
            while (j >= 0 && x < output[j]) {
                output[j + 1] = output[j];
                j--;
            }
            output[j + 1] = x;
        }
        return output;
    }
}
