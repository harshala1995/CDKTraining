package src.Assignment1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by chavanh on 7/31/2017.
 */
public class ThreadB extends Thread {
    @Override
    public void run() {
        InputStream fis = null;
        try {
            fis = new FileInputStream("C:\\Users\\chavanh\\IdeaProjects\\Day8\\Day11\\src\\Assignment1\\File2.txt");
            int b = fis.read();
            while (b != -1) {
                //System.out.println(b);
                System.out.print((char) b);
                b = fis.read();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fis != null) {
                    fis.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
