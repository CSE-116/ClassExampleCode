package topic7_trees.example;

import topic5_inheritance.HealthPotion;
import topic7_trees.BST;

public class Main {

    public static void main(String[] args) {
        BST<HealthPotion> bst = new BST<>(new HealthPotionComparator());

        bst.insert(new HealthPotion(5.0, 10.2, 10));
        bst.insert(new HealthPotion(5.0, 10.2, 5));
        bst.insert(new HealthPotion(5.0, 10.2, 7));
        bst.insert(new HealthPotion(5.0, 10.2, 1));
        bst.insert(new HealthPotion(5.0, 10.2, 50));
        bst.insert(new HealthPotion(5.0, 10.2, 100));
        bst.insert(new HealthPotion(5.0, 10.2, 6));

        System.out.println(bst.getRoot().inOrderTraversal(bst.getRoot()));
    }

}
