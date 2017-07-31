import java.util.Comparator;

/**
 * Created by chavanh on 7/26/2017.
 */
public class IdComparator implements Comparator<Car> {
    @Override
    public int compare(Car c1, Car c2) {
        return (c1.getId() - c2.getId());
    }
}