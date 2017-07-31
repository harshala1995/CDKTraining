package Assignment1;

/**
 * Created by chavanh on 7/26/2017.
 */
// InvalidPriceException would be proper name for this class. 
public class InvalidPrice extends Exception {
    public InvalidPrice() {
    }

    public InvalidPrice(String message) {
        super(message);
    }
}
