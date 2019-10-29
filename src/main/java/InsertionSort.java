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
        double[] vector = {4,213,1,32,87,1.4,25};
        sorter.sort(vector);
        for (int i =0; i < vector.length; i++) System.out.println(vector[i]);

    }
}
