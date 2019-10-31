public class InsertionSort implements SortingInterface {
    @Override
    public double[] sort(double[] unsortedVector) {
        double[] output = unsortedVector.clone();
        for(int i = 1; i < output.length; i++){
            double x = output[i];
            int j = i - 1;
            while(j >= 0 && x < output[j]){
                output[j + 1] = output[j];
                j--;
            }
            output[j+1] = x;
        }
        return output;
    }

    /*public static void main(String args[]){
        SortingInterface sorter = new InsertionSort();
        SortingInterface sorter2 = new SelectionSort();
        SortingInterface sorter3 = new QuickSort();
        double[] vector = {10, 1.2, 14, 210, 0.4, -23, 72};
        sorter2.sort(vector);
        for (int i =0; i < vector.length; i++) System.out.println(vector[i]);

    }*/
}
