import java.util.*;

/**
 * Created by chavanh on 7/26/2017.
 */
public class CarDemo {
    //public static List<Car> car = new ArrayList<Car>();

    public static void main(String[] args) {
        Set<Car> car = new TreeSet<>();
        createSetData(car);
        Iterator<Car> itr = car.iterator();
        while (itr.hasNext()) {
            Car cars = itr.next();
            System.out.println(cars.toString());

        }
        System.out.println("======================");
        List<Car> list = new ArrayList<>();
        list.addAll(car);
        Collections.sort(list, new IdComparator());
        Iterator<Car> itr1 = list.iterator();
        while (itr1.hasNext()) {
            Car cars = itr1.next();
           System.out.println(cars);

        }
        System.out.println("=======================");

        Collections.sort(list, new BrandComparator());
        Iterator<Car> itr2 = list.iterator();
        while (itr2.hasNext()) {
            Car cars = itr2.next();
           System.out.println(cars);

        }
    }

    public static void createSetData(Set<Car> car) {
        car.add(new Car(101, "Audi", 50000));
        car.add(new Car(103, "Mercedes", 10000));
        car.add(new Car(106, "Jaguar", 30000));
        car.add(new Car(108, "Aston Martin", 60000));
        car.add(new Car(100, "Ferrari", 110000));
        car.add(new Car(110, "BMW", 19000));
        car.add(new Car(112, "Suzuki", 300000));
        car.add(new Car(102, "Honda", 70000));
        car.add(new Car(104, "Audi", 90000));
        car.add(new Car(113, "Ferrari", 20000));
        car.add(new Car(116, "Nano", 80000));
        car.add(new Car(118, "BMW", 90000));
        car.add(new Car(120, "Swift DZire", 220000));
        car.add(new Car(121, "Audi", 550000));
        car.add(new Car(127, "Volswagon", 330000));
        car.add(new Car(107, "Audi", 530000));
        car.add(new Car(122, "Ford", 230000));

    }
}
    //List<Double> salary = new ArrayList<>(10);


        /*Collections.sort(
    Car car);
    Iterator<Car> itr = car.iterator();
        while(itr.hasNext())

    {
        Car car = itr.next();
        System.out.println("ID: " + car.getId() + "Brand: " + car.getBrand() + "Price: " + car.getPrice());
    }

    sortOnId();

    sortOnBrand();

    public static void sortOnId(Object)
}*/