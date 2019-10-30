public class InsertionSort implements SortingInterface {
    @Override
    public void sort(double[] unsortedVector) {
        for(int i = 1; i < unsortedVector.length; i++){
            double x = unsortedVector[i];
            int j = i - 1;
            while(j >= 0 && x < unsortedVector[j]){
                unsortedVector[j + 1] = unsortedVector[j];
                j--;
            }
            unsortedVector[j+1] = x;
        }
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
