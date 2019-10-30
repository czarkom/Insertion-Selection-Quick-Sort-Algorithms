public class SelectionSort implements SortingInterface {
    @Override
    public void sort(double[] unsortedVector) {
        if(unsortedVector == null || unsortedVector.length < 1) throw new IllegalArgumentException("Please give me normal array");
        double temp;
        for (int i = unsortedVector.length - 1; i >= 1; i--) {
            int max = findMaxValueIndex(unsortedVector, i);
            if(max != i){
                HelpfulMethods.swap(unsortedVector, max, i);
            }
        }
    }

    private int findMaxValueIndex(double[] vector, int lastIndex) {
        int maxValueIndex = 0;
        for (int i = 1; i <= lastIndex; i++) {
            if (vector[i] > vector[maxValueIndex]) maxValueIndex = i;
        }
        return maxValueIndex;
    }
}
