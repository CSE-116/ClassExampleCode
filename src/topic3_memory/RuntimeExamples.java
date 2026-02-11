package topic3_memory;

public class RuntimeExamples {

    public static void constantRuntime(int[] input){
        int n = input.length;
        if(n > 5){
            input[5] = 10;
        }
    }

    public static int linearRuntime(int[] input){
        int n = input.length;
        int sum = 0;
        for(int i=0; i<n; i++){
            sum += input[i];
        }
        return sum;
    }

    public static int quadraticRuntime(int[] input){
        linearRuntime(input);
        linearRuntime(input);
        linearRuntime(input);
        linearRuntime(input);
        int n = input.length;
        int sumTimesSize = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                sumTimesSize += input[j];
            }
        }
        return sumTimesSize;
    }

}
