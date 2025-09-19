package topic6_polymorphism.lecture1.sorting;

public interface IntComparator extends Comparator<Integer> {

    @Override
    boolean compare(Integer a, Integer b);

}
