package topic6_polymorphism.starting_point.sorting;

public class IntDecreasing extends Comparator<Integer> {

    @Override
    public boolean compare(Integer a, Integer b) {
        return a > b;
    }
}
