/**
 * Created by chavanh on 8/2/2017.
 */
public class SportCar extends Car {
    String owner;
    double average_speed;

    public SportCar(String name, int model_no, String color, int seats, double speed, String manufacturer, String owner, double average_speed) {
        super(name, model_no, color, seats, speed, manufacturer);
        this.owner = owner;
        this.average_speed = average_speed;
    }
    public void start(){
        System.out.println("Car has started racing");
    }
    public void info(){
        System.out.println("the owner of the car is:" +this.owner);
    }
}
