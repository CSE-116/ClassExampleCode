package topic8_trees;

public class TreeTraversals {


    public static <A> String preOrderTraversal(BinaryTreeNode<A> node) {
        if (node != null) {
            String out = "";
            out += node.getValue().toString() + " ";
            out += preOrderTraversal(node.getLeft());
            out += preOrderTraversal(node.getRight());
            return out;
        } else {
            return "";
        }
    }

    public static <A> String postOrderTraversal(BinaryTreeNode<A> node) {
        if (node != null) {
            String out = "";
            out += postOrderTraversal(node.getLeft());
            out += postOrderTraversal(node.getRight());
            out += node.getValue().toString() + " ";
            return out;
        } else {
            return "";
        }
    }

    public static <A> String inOrderTraversal(BinaryTreeNode<A> node) {
        if (node != null) {
            String out = "";
            out += inOrderTraversal(node.getLeft());
            out += node.getValue().toString() + " ";
            out += inOrderTraversal(node.getRight());
            return out;
        } else {
            return "";
        }
    }

}
