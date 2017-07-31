import java.util.Comparator;

/**
 * Created by chavanh on 7/26/2017.
 */
public class BrandComparator implements Comparator<Car> {
    @Override
    public int compare(Car c1, Car c2) {
        int i = c1.getBrand().compareTo(c2.getBrand());
        return i;
    }
}
