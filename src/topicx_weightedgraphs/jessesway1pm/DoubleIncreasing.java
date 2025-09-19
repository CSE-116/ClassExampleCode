package topicx_weightedgraphs.jessesway1pm;

import topic5_inheritance.Comparator;

public class DoubleIncreasing extends Comparator<Double> {

    @Override
    public boolean compare(Double a, Double b) {
        return a < b;
    }
}
