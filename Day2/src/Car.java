/**
 * Created by chavanh on 8/2/2017.
 */
public class Car extends Automobile {
    String manufacturer;

    public Car(String name, int model_no, String color, int seats, double speed, String manufacturer) {
        super(name, model_no, color, seats, speed);
        this.manufacturer = manufacturer;
    }

    public void display() {
        super.display();
        System.out.println("Car manufacturer:" + this.manufacturer);
    }

}
