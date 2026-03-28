package memoryexamples.example6_recursion;

public class Trace2 {

    public static int computeGeometricSumTail(int n, int total) {
        if (n > 0) {
            return computeGeometricSumTail(n - 1, total + n);
        } else {
            return total;
        }
    }

    public static int cGSTHelper(int n) {
        return computeGeometricSumTail(n, 0);
    }

    public static void main(String[] args) {
        int result = cGSTHelper(3);
    }

}
