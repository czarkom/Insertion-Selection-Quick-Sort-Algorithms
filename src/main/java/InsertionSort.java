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

    public static void main(String args[]){
        InsertionSort sorter = new InsertionSort();
        SelectionSort sorter2 = new SelectionSort();
        double[] vector = {10,1,27,2.4,-3,241,87,1.2};
        sorter2.sort(vector);
        for (int i =0; i < vector.length; i++) System.out.println(vector[i]);

    }
}
