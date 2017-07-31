import java.util.Comparator;

/**
 * Created by chavanh on 7/26/2017.
 */
public class BrandComparator implements Comparator<Car> {
    @Override
    public int compare(Car c1, Car c2) {
        int i = c1.getBrand().compareTo(c2.getBrand());
        // you can directly return output of result of above statement instead of creating new variable.
        return i;
    }
}
