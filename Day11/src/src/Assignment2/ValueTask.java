package src.Assignment2;

/**
 * Created by chavanh on 7/31/2017.
 */
public class ValueTask implements Runnable {

    static int i = 0;
    @Override
    public void run() {

            i++;
    }
}
