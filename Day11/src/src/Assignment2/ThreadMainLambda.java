package src.Assignment2;

/**
 * Created by chavanh on 7/31/2017.
 */

// alternate code for the above concept. Here everything is done in one class only using lambda function.
public class ThreadMainLambda {
    static int i = 0;
    public static void main(String[] args) {
        //ValueTask valuetask = new ValueTask();
        //PrintTask printtask = new PrintTask();
        for (int j = 0; j < 20; j++) {
            Thread thread1 = new Thread(() -> {
                i++;
            });
            thread1.start();
            Thread thread2 = new Thread(() -> {
                System.out.println(i); });
                thread2.start();

        }
    }
}
