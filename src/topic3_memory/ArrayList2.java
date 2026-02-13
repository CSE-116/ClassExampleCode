package topic3_memory;

public class ArrayList2 {

    private int[] elements = new int[4];
    private int size = 0;

    public ArrayList2(){

    }

    public int get(int index){
        if(index < this.size){
            return this.elements[index];
        }
        return 0;

    }

    public void set(int index, int elem){
        if(index < this.size){
            this.elements[index] = elem;
        }
    }

    private void grow(){
        int[] newElements = new int[this.elements.length * 2];
        for (int i = 0; i < this.elements.length; i++) {
            newElements[i] = this.elements[i];
        }
        this.elements = newElements;
    }

    public void add(int elem){
        if(this.size == this.elements.length){
            grow();
        }
        this.elements[this.size] = elem;
        this.size++;
    }

    public static void main(String[] args) {
        ArrayList2 arr = new ArrayList2();

        for (int i = 0; i < 20; i++) {
            arr.add(i * 10);
        }
        System.out.println();
    }

}
