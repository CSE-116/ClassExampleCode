package topic6_polymorphism.refactor3.sorting;

public class IntDecreasing implements Comparator<Integer> {

    @Override
    public boolean compare(Integer a, Integer b) {
        return a > b;
    }
}
