package topic6_polymorphism;

public interface Comparator<T> {
    //return true if a comes before b and false otherwise
    boolean compare(T a, T b);
}
