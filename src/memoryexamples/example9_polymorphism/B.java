package memoryexamples.example9_polymorphism;

public class B extends A {

    private int b;

    public B(int b) {
        super(b);
        this.b = b * 2;
    }

}