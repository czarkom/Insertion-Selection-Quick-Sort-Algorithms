public class QuickSort implements SortingInterface {
    @Override
    public double[] sort(double[] unsortedVector) {
        if(unsortedVector == null || unsortedVector.length < 1 ) throw new IllegalArgumentException("Please give me normal array");
        double[] output = unsortedVector.clone();
        if (unsortedVector.length < 20) {
            SortingInterface sorter = new InsertionSort();
            output = sorter.sort(output);
            return output;
        } else {
            Stack<Integer> stack = new Stack<>();
            stack.push(0);
            stack.push(output.length);
            while (!stack.isStackEmpty()) {
                int end = stack.pop();
                int start = stack.pop();
                if (end - start < 2) continue;
                int p = start + ((end - start) / 2);
                p = partition(output, p, start, end);
                stack.push(p + 1);
                stack.push(end);
                stack.push(start);
                stack.push(p);
            }
        }
        return output;
    }

    private int partition(double[] vector, int position, int start, int end) {
        int l = start;
        int h = end - 2;
        double pivot = vector[position];
        double temp = vector[position];
        vector[position] = vector[end - 1];
        vector[end - 1] = temp;
        while (l < h) {
            if (vector[l] < pivot) {
                l++;
            } else if (vector[h] >= pivot) {
                h--;
            } else {
                HelpfulMethods.swap(vector, l, h);
            }
        }
        int idx = h;
        if (vector[h] < pivot) {
            idx++;
        }
        HelpfulMethods.swap(vector, end - 1, idx);
        return idx;
    }


}
