package src.Assignment2;

/**
 * Created by chavanh on 7/31/2017.
 */
public class Worker2 extends Thread {
    PrintTask printTask = null;

    public Worker2(PrintTask printTask) {
        this.printTask = printTask;
    }
    @Override
    public void run(){
        printTask.run();
    }
}
