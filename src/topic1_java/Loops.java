package topic1_java;

public class Loops {
    public static void main(String[] args) {
        double val = 10.0;
        while (val>1) {
            System.out.println(val);
            val /= 2;
        }

        for (int x=0; x<5; x++) {
            System.out.println(x);
        }
    }
}
