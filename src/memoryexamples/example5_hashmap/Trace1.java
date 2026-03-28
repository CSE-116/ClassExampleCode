package memoryexamples.example5_hashmap;

import java.util.HashMap;

public class Trace1 {

    public static void main(String[] args) {
        HashMap<String, Integer> bills = new HashMap<>();
        bills.put("Allen", 17);
        bills.put("Knox", 88);
        for (String key : bills.keySet()) {
            System.out.println(key);
        }
    }

}
