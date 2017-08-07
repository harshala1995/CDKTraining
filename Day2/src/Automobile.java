/**
 * Created by chavanh on 8/2/2017.
 */
public class Automobile {
    String name;
    int model_no;
    String color;
    int seats;
    double speed;

    Automobile() {
    }

    public Automobile(String name, int model_no, String color, int seats, double speed) {
        this.name = name;
        this.model_no = model_no;
        this.color = color;
        this.seats = seats;
        this.speed = speed;
    }

    public void start() {
        System.out.println("Vehicle started");
    }

    public void stop() {
        this.speed = 0;
        System.out.println("Vehicle stopped");
    }

    public void display() {
        System.out.println("Name is:" + this.name);
        System.out.println("model_no is:" + this.model_no);
        System.out.println("color is:" + this.color);
        System.out.println("seats is:" + this.seats);
        System.out.println("speed is:" + this.speed);
    }
}
