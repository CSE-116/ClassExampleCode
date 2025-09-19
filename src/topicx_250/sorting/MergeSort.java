package topicx_250.sorting;

import topic5_inheritance.Comparator;

import java.util.ArrayList;
import java.util.List;

public class MergeSort<T> implements Sorter<T> {

    private Comparator<T> comparator;

    public MergeSort(Comparator<T> comparator) {
        this.comparator = comparator;
    }

    public List<T> sort(List<T> input) {
        if(input.size() <= 1){
            return input;
        }

        int midpoint = input.size() / 2;

        List<T> left = input.subList(0, midpoint);
        List<T> right = input.subList(midpoint, input.size());

        List<T> leftSorted = this.sort(left);
        List<T> rightSorted = this.sort(right);

        return this.merge(leftSorted, rightSorted);
    }

    private List<T> merge(List<T> left, List<T> right) {
        List<T> sorted = new ArrayList();

        int leftIndex = 0;
        int rightIndex = 0;

        while (leftIndex != left.size() && rightIndex != right.size()) {
            T leftValue = left.get(leftIndex);
            T rightValue = right.get(rightIndex);
            if (this.comparator.compare(leftValue, rightValue)) {
                sorted.add(leftValue);
                leftIndex++;
            } else {
                sorted.add(rightValue);
                rightIndex++;
            }
        }

        while (leftIndex != left.size()) {
            sorted.add(left.get(leftIndex));
            leftIndex++;
        }

        while (rightIndex != right.size()) {
            sorted.add(right.get(rightIndex));
            rightIndex++;
        }

        return sorted;
    }

}
