package memoryexamples.example2_methods;

public class Trace2 {

    public static void printValue(int n) {
        int temp = n + 2;
        System.out.println("temp == " + temp);
    }

    public static void main(String[] args) {
        printValue(4);
    }

}
