package designProblems.arrayOperation;

public class ArrayOperation {

    protected class Statistics {
        double mean(int[] array) {
            double result = 0;
            for (int i = 0; i < array.length; i++) {
                result += array[i];
            }
            result = result / (array.length);
            return result;
        }
    }
}
