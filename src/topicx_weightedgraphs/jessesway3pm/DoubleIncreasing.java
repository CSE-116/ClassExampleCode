package topicx_weightedgraphs.jessesway3pm;

import topic5_inheritance.Comparator;

public class DoubleIncreasing extends Comparator<Double> {

    @Override
    public boolean compare(Double d1, Double d2){
        return d1 < d2;
    }

}
