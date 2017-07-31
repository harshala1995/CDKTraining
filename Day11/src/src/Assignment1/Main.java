package src.Assignment1;

/**
 * Created by chavanh on 7/31/2017.
 */
public class Main{
    public static void main(String[] args) {
        ThreadA taskA = new ThreadA();
        ThreadB taskB = new ThreadB();
        Thread threadA = new Thread(taskA);
        Thread threadB = new Thread(taskB);
        threadA.start();
        threadB.start();
        System.out.println("Finish");
    }
}