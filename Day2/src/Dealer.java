/**
 * Created by chavanh on 8/3/2017.
 */
public class Dealer {
    public static void main(String[] args) {
        Car c = new Car("Audi Q7", 2003, "red", 4, 100, "Audi");
        c.start();
        c.stop();
        c.display();
        Bus b = new Bus("Toyota", 32, "Blue", 30, 40, "Mumbai", "Pune");
        b.display();
        FlyingCar fly = new FlyingCar("Ferrari", 30, "Green", 2, 70,"Ferrari", 100);
        fly.display();
        SportCar sport = new SportCar("BMW", 10001, "Black", 2, 80, "BMWQ8", "BMW", 75);
        sport.start();
        sport.info();
    }

}
