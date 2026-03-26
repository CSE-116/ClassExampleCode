package topic8_trees;

public class BinaryTreeNode<A> {
    private A value;
    private BinaryTreeNode<A> left;
    private BinaryTreeNode<A> right;

    public BinaryTreeNode(A value, BinaryTreeNode<A> left, BinaryTreeNode<A> right) {
        this.value = value;
        this.right = right;
        this.left = left;
    }

    public A getValue() {
        return value;
    }

    public void setValue(A value) {
        this.value = value;
    }

    public BinaryTreeNode<A> getLeft() {
        return left;
    }

    public void setLeft(BinaryTreeNode<A> left) {
        this.left = left;
    }

    public BinaryTreeNode<A> getRight() {
        return right;
    }

    public void setRight(BinaryTreeNode<A> right) {
        this.right = right;
    }


    /*** Examples ***/

    public static <A> void traversal(BinaryTreeNode<A> node) {
        if (node != null) {
            traversal(node.left);
            traversal(node.right);
            System.out.print(node.value + " ");
        }
    }

    public static void stringExample() {
        BinaryTreeNode<String> root = new BinaryTreeNode<>("day", null, null);
        root.left = new BinaryTreeNode<>("have", null, null);
        root.right = new BinaryTreeNode<>("great", null, null);
        root.right.left = new BinaryTreeNode<>("a", null, null);
        traversal(root);
    }

    public static void intExample() {
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(5, null, null);
        root.left = new BinaryTreeNode<>(2, null, null);
        root.right = new BinaryTreeNode<>(8, null, null);
        root.left.left = new BinaryTreeNode<>(-3, null, null);
        root.left.right = new BinaryTreeNode<>(4, null, null);
        root.right.left = new BinaryTreeNode<>(7, null, null);
        root.right.right = new BinaryTreeNode<>(14, null, null);

        System.out.println(TreeTraversals.preOrderTraversal(root));
        System.out.println(TreeTraversals.inOrderTraversal(root));
        System.out.println(TreeTraversals.postOrderTraversal(root));
    }


    public static void main(String[] args) {
        intExample();
        stringExample();
    }
}
