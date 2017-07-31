package Assignment1;

/**
 * Created by chavanh on 7/26/2017.
 */
public class Cinema {
    public static void main(String[] args) {
        User user = new User(1, "ram", 22, 2);

        MovieService movie = new MovieService();
        try {
            movie.buy(user, 1000);
            //movie.buy(user, -3);
        } catch (InvalidPrice p) {
            System.out.println(p.getMessage());
        }
        try {
            movie.watch(user);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        } catch (AgeBelow10 e) {
            System.out.println(e.getMessage());
        } catch (AgeBelow20Exception e) {
            System.out.println(e.getMessage());
        } catch (UserRatingBelow3 e) {
            System.out.println(e.getMessage());
        }
    }
}