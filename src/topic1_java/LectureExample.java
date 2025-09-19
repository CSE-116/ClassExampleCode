package topic1_java;


import java.util.ArrayList;
import java.util.Arrays;

public class LectureExample {

    // Write a method that returns the sum of all values in
    // and ArrayList of ints
    public static int sumInts(ArrayList<Integer> numbers){
        int sum = 0;

        // option 1
        for(int i=0; i<numbers.size(); i++){
            String x = "asdf";
            x += "hhh";
            sum += numbers.get(i);
        }

        // option 2
        for(int i : numbers){
            sum += i;
        }

        return sum;
    }

    public static void main(String[] args) {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1, 3, 8, -7));

        int result = sumInts(input);
        System.out.println(result);
    }

}
