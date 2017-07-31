package src.Assignment2;

/**
 * Created by chavanh on 7/31/2017.
 */

public class ThreadMain {
    public static void main(String[] args) {
        //ValueTask valuetask = new ValueTask();
        //PrintTask printtask = new PrintTask();
        for (int i = 0; i < 20; i++) {
            Worker1 worker1 = new Worker1(new ValueTask());
            Worker2 worker2 = new Worker2(new PrintTask());
            worker1.start();
            worker2.start();
        }

    }
}
