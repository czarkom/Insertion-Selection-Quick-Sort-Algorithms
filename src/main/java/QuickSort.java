public class QuickSort implements SortingInterface {
    @Override
    public void sort(double[] unsortedVector) {
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        stack.push(unsortedVector.length);
        while (!stack.isStackEmpty()) {
            int end = stack.pop();
            int start = stack.pop();
            if (end - start < 2) continue;
            int p = start + ((end - start) / 2);
            p = partition(unsortedVector, p, start, end);
            stack.push(p + 1);
            stack.push(end);
            stack.push(start);
            stack.push(p);
        }
    }

    private int partition(double[] unsortedVector, int position, int start, int end) {
        int l = start;
        int h = end - 2;
        double pivot = unsortedVector[position];
        double temp = unsortedVector[position];
        unsortedVector[position] = unsortedVector[end - 1];
        unsortedVector[end - 1] = temp;
        while (l < h) {
            if (unsortedVector[l] < pivot) {
                l++;
            } else if (unsortedVector[h] >= pivot) {
                h--;
            } else {
                HelpfulMethods.swap(unsortedVector, l, h);
            }
        }
        int idx = h;
        if (unsortedVector[h] < pivot) {
            idx++;
        }
        HelpfulMethods.swap(unsortedVector, end - 1, idx);
        return idx;
    }


}
