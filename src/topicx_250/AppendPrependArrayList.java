package topicx_250;

import java.util.ArrayList;

public class AppendPrependArrayList<T> implements IAppendPrependDS<T> {

    private ArrayList<T> data = new ArrayList<>();

    @Override
    public void append(T element) {
        this.data.add(element);
    }

    @Override
    public void prepend(T element) {
        this.data.add(0, element);
    }
}
