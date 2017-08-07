/**
 * Created by chavanh on 8/2/2017.
 */
public class Bus extends Automobile {
    String from;
    String to;

    public Bus(String name, int model_no, String color, int seats, double speed, String from, String to) {
        super(name, model_no, color, seats, speed);
        this.from = from;
        this.to = to;
    }

    public void display() {
        super.display();
        System.out.println("Bus travels from " + this.from + " to " + this.to);
    }

}
