package topic6_polymorphism.refactor4.sorting;

public interface Comparator<T> {

    abstract public boolean compare(T a, T b);

}
