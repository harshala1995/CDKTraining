package Assignment1;

/**
 * Created by chavanh on 7/26/2017.
 */
public class MovieService {
    public void buy(User user, double price) throws InvalidPrice {
        if (price < 0) {
            InvalidPrice e1 = new InvalidPrice("invalid price");
            throw e1;
        }
        if (price < 2000) {
            InvalidPrice e2 = new InvalidPrice("Price below 2000");
            throw e2;
        }
    }

    public void watch(User user) throws InvalidAgeException, AgeBelow10, AgeBelow20Exception, UserRatingBelow3 {
        // if there is case where perticular case will be passed only at one if block then use if-else if. 
        // in below case it is fine to have separate if blocks as you are throwing exception right way and not going to execute next statement.
        if (user.getAge() < 0) {
            InvalidAgeException e3 = new InvalidAgeException("Invalid age");
            throw e3;
        }
        if (user.getAge() < 10) {
            AgeBelow10 e4 = new AgeBelow10("Age less than 10");
            throw e4;
        }
        if (user.getAge() < 20) {
            AgeBelow20Exception e5 = new AgeBelow20Exception("Age less than 20");
            throw e5;
        }
        if (user.getRating() < 3) {
            UserRatingBelow3 e6 = new UserRatingBelow3("Rating less than 3");
            throw e6;
        }
    }

}
