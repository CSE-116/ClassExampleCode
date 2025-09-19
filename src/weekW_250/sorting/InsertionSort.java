package weekW_250.sorting;

import week7.Comparator;

import java.util.ArrayList;
import java.util.List;

public class InsertionSort<T> implements Sorter<T> {

    private Comparator<T> comparator;

    public InsertionSort(Comparator<T> comparator){
        this.comparator = comparator;
    }

    public List<T> sort(List<T> input) {

        ArrayList<T> output = new ArrayList<>();

        for (T valueToInsert : input) {
            int location = 0;
            for (T valueToCompare : output) {
                if (this.comparator.compare(valueToCompare, valueToInsert)) {
                    location++;
                }
            }
            output.add(location, valueToInsert);
        }

        return output;
    }

}
