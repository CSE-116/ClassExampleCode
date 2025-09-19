package topicx_250;

import topic4_linkedlists.LinkedListNode;

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
