package src.Assignment2;

/**
 * Created by chavanh on 7/31/2017.
 */
public class PrintTask implements Runnable{
    @Override
    public void run() {
        System.out.println("I:" +ValueTask.i);

    }
}
