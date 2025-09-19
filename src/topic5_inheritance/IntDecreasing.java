package topic5_inheritance;

public class IntDecreasing extends Comparator<Integer> {

    @Override
    public boolean compare(Integer a, Integer b) {
        return a > b;
    }
}
