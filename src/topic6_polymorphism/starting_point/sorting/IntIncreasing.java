package topic6_polymorphism.starting_point.sorting;

public class IntIncreasing extends Comparator<Integer> {

    @Override
    public boolean compare(Integer a, Integer b) {
        return a < b;
    }
}
