package weekW_250;

import java.util.ArrayList;

public class Main {

    private static long timeIt(Timable method){
        long start = System.currentTimeMillis();
        method.run();
        long end = System.currentTimeMillis();
        long elapsedTime = end - start;
        return elapsedTime;
    }

    private static boolean isSorted(ArrayList<Integer> input){
        return false;
    }

    private static void populate(int n, IAppendPrependDS<Double> adt){
        for (int i = 0; i < n; i++) {
            adt.append(Math.random() * 1000);
        }
    }

    public static void main(String[] args) {
        int n = 100000000;
        long elapsedTime = timeIt(() -> {
            populate(n, new AppendPrependArrayList<>());
        });
        System.out.println("method took " + elapsedTime + "ms");
    }

}
