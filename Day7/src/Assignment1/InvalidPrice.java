package Assignment1;

/**
 * Created by chavanh on 7/26/2017.
 */
public class InvalidPrice extends Exception {
    public InvalidPrice() {
    }

    public InvalidPrice(String message) {
        super(message);
    }
}
