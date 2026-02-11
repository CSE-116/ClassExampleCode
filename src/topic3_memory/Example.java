package topic3_memory;

public class Example {

    private int a;
    private double b;
    private boolean c;

    public Example(int a, double b, boolean c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public static void main(String[] args) {
        int a = 1000000000;
        double b = 1000000000.0;
        boolean c = true;
        Example e1 = new Example(a, b, c);
        Example e2 = e1;
    }

}