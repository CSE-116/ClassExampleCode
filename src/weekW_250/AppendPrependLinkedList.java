package weekW_250;

import week5.LinkedListNode;

public class AppendPrependLinkedList<T> implements IAppendPrependDS<T> {

    private LinkedListNode<T> data = null;

    @Override
    public void append(T element) {
        if(this.data == null){
            this.data = new LinkedListNode<>(element, null);
        }else{
            this.data.appendLoop(element);
        }
    }

    @Override
    public void prepend(T element) {
        this.data = new LinkedListNode<>(element, this.data);
    }




}
