package topic9_runtime;

public class TimingUtils {

    public static long timeIt(Timable method){
        long start = System.currentTimeMillis();
        method.run();
        long end = System.currentTimeMillis();
        long elapsedTime = end - start;
        return elapsedTime;
    }

}
