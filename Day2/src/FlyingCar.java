/**
 * Created by chavanh on 8/2/2017.
 */
public class FlyingCar extends Car {
    int take_of_speed;

    public FlyingCar(String name, int model_no, String color, int seats, double speed, String manufacturer, int take_of_speed) {
        super(name, model_no, color, seats, speed, manufacturer);
        this.take_of_speed = take_of_speed;
    }

    public void display() {
        super.display();
        System.out.println("takeofspeed is:" + take_of_speed);
    }
}