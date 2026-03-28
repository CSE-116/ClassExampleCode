package memoryexamples.example2_methods;

public class Trace1 {

    public static double multiplyByTwo(double input) {
        double x = input * 2;
        return x;
    }

    public static void main(String[] args) {
        double x = 7.0;
        double result = multiplyByTwo(x);
        result = multiplyByTwo(result);
        System.out.println(result);
        int y = 3;
    }

}
