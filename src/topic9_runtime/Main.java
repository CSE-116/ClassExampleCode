package topic9_runtime;

import java.util.ArrayList;

public class Main {

    private static boolean isSorted(ArrayList<Integer> input){
        return false;
    }

    private static void populate(int n, IAppendPrependDS<Double> adt){
        for (int i = 0; i < n; i++) {
            adt.append(Math.random() * 1000);
        }
    }

    public static void main(String[] args) {
        int n = 1000;
        long elapsedTime = TimingUtils.timeIt(() -> {
            populate(n, new AppendPrependArrayList<>());
        });
        System.out.println(elapsedTime + "ms to insert " + n + " values in a BST");

    }

}
