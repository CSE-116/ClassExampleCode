package topic3_memory;

public class Recursion {

    public static int sumOfDigitsRecursive(int input){
        if(input == 0){
            return 0;
        }else{
            int partialResult = sumOfDigitsRecursive(input/10);
            return partialResult + input % 10;
        }
    }

    public static int arraySum(int[] numbers){
        return arraySumHelper(numbers, 0);
    }

    public static int arraySumHelper(int[] numbers, int index){
        if(index == numbers.length){
            return 0;
        }else{
            return arraySumHelper(numbers, index + 1) + numbers[index];
        }
    }

    public static int arraySumTailRecursion(int[] numbers){
        return arraySumTailRecursionHelper(numbers, 0, 0);
    }


    public static int arraySumTailRecursionHelper(int[] numbers, int index, int sum){
        if(index == numbers.length){
            return sum;
        }else{
            return arraySumTailRecursionHelper(numbers, index + 1, sum + numbers[index]);
        }
    }

    public static void main(String[] args) {
        int result = sumOfDigitsRecursive(586);
        System.out.println(result);

        int[] numbers = {10, 20, 30};
        int result2 = arraySum(numbers);
        int result3 = arraySumTailRecursion(numbers);
        System.out.println(result2);
        System.out.println(result3);
    }

}