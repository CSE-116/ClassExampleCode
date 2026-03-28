package memoryexamples.example6_recursion;

public class Trace1 {

    public static int computeGeometricSum(int n) {
        if (n > 0) {
            int result = computeGeometricSum(n - 1);
            result += n;
            return result;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        int result = computeGeometricSum(3);
    }

}
