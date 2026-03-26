package topic9_runtime.trees;

import topic8_trees.BST;
import topic8_trees.TreeTraversals;
import topic9_runtime.TimingUtils;
import topicx_weightedgraphs.jessesway1pm.DoubleIncreasing;

public class TimeTrees {

    private static double randomDouble() {
        int placesToRound = 5;
        double randomNum = 200.0 * (Math.random() - 0.5); // random number between -100.0 and 100.0
        double roundingFactor = Math.pow(10.0, placesToRound);
        randomNum = Math.round(randomNum * roundingFactor) / roundingFactor;
        return randomNum;
    }

    private static void populateTree(BST<Double> bst, int n) {
        for (int i = 0; i < n; i++) {
            bst.insert(randomDouble());
//            bst.insertIterative(randomDouble());
//            bst.insertIterative(42.0);
        }
    }


    public static void main(String[] args) {
        int n = 1_000_000;
        BST<Double> bst = new BST<>(new DoubleIncreasing());
        long elapsed = TimingUtils.timeIt(() -> {
            populateTree(bst, n);
        });
        System.out.println(elapsed + "ms to insert " + n + " values in a BST");

        elapsed = TimingUtils.timeIt(() -> {
            String treeAsSting = TreeTraversals.inOrderTraversal(bst.getRoot());
//            System.out.println(treeAsSting);
        });

        System.out.println(elapsed + "ms to traverse a tree of size " + n);

        int m = 100;
        elapsed = TimingUtils.timeIt(() -> {
            for (int i = 0; i < m; i++) {
                if (bst.find(randomDouble())) {
                    System.out.print("+");
                } else {
                    System.out.print("-");
                }
            }
            System.out.println();
        });

        System.out.println(elapsed + "ms to find " + m + " random values in a BST of size " + n);
    }

}
