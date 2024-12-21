package designProblems.arrayOperation;

// import designProblems.arrayOperation.ArrayOperation.Statistics;

public class Main {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4 };
        ArrayOperation opr = new ArrayOperation();
        ArrayOperation.Statistics opr1 = opr.new Statistics();
        System.out.println(opr1.mean(arr));
    }
}
