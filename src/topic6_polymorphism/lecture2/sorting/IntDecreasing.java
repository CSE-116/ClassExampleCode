package topic6_polymorphism.lecture2.sorting;


public class IntDecreasing implements Comparator<Integer> {

    public boolean compare(Integer a, Integer b) {
        return a > b;
    }

}
