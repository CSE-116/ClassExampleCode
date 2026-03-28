package memoryexamples.example4_arraylist;

import java.util.ArrayList;

public class Trace1 {

    public static void main(String[] args) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        for (int x = 0; x < 4; x++) {
            arr1.add(x);
        }
        System.out.println(arr1);
        ArrayList<Integer> arr2 = arr1;
        System.out.println(arr2);
    }

}
