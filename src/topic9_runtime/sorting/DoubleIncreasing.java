package topic9_runtime.sorting;

public class DoubleIncreasing implements Comparator<Double> {

    private static final double EPSILON = 0.0000000000001;

    @Override
    public boolean compare(Double a, Double b) {
        return a < (b - EPSILON);
    }
}
