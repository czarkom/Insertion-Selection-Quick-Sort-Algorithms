public class HelpfulMethods {
    public static void swap(double[] vector, int indexA, int indexB){
        double temp = vector[indexA];
        vector[indexA] = vector[indexB];
        vector[indexB] = temp;
    }
}
