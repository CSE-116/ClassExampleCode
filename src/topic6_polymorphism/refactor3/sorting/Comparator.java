package topic6_polymorphism.refactor3.sorting;

public interface Comparator<T> {
    //return true if a comes before b and false otherwise
    boolean compare(T a, T b);
}
