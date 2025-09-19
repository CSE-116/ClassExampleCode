package weekW_250.sorting;

import week7.IntDecreasing;
import weekW_250.Timable;

import java.util.ArrayList;
import java.util.List;

public class MainSorting {

    private static long timeIt(Timable method){
        long start = System.currentTimeMillis();
        method.run();
        long end = System.currentTimeMillis();
        long elapsedTime = end - start;
        return elapsedTime;
    }

    private static void populate(int n, List<Integer> list){
        for (int i = 0; i < n; i++) {
            list.add((int)(Math.random() * 1000));
        }
    }

    public static void main(String[] args) {
        int n = 1000000;
        ArrayList<Integer> numbers = new ArrayList<>();
        populate(n, numbers);
        long elapsedTime = timeIt(() -> {
            List<Integer> output = new MergeSort<>(new IntDecreasing()).sort(numbers);
//            System.out.println(output);
        });
        System.out.println("method took " + elapsedTime + "ms");
    }

}
