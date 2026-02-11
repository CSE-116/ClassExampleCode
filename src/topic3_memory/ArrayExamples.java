package topic3_memory;

public class ArrayExamples{

    public static void example1(){
        int[] numbers = new int[3];
        int[] moreNumbers = {10,20,30};
        numbers[0] = 5;
        numbers[1] = 10;
        int x = numbers[2];
        System.out.println(numbers);
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        for(int i : numbers){
            System.out.println(i);
        }
    }


    public static void example2(){
        int[] numbers = {50, 27, 12, 100};
    }

    public static void main(String[] args) {
        example1();
        example2();
    }
}