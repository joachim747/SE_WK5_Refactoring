import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RentalTest {
    @Test
    public void testRentalDaysGetter() {
        int days = 4;
        Rental rental = new Rental(new Movie("", 0), days);
        assertEquals(rental.getDaysRented(), days);
    }

    @Test
    public void testRentalDaysZeroGetter() {
        int days = 0;
        Rental rental = new Rental(new Movie("", 0), days);
        assertEquals(rental.getDaysRented(), days);
    }

    @Test
    public void testRentalDaysNegativeGetter() {
        int days = -4;
        Rental rental = new Rental(new Movie("", 0), days);
        assertEquals(rental.getDaysRented(), days);
    }

    @Test
    public void testRentalDaysMovieGetter() {
        Movie movie = new Movie("", 0);
        Rental rental = new Rental(movie, 0);
        assertEquals(rental.getMovie(), movie);
    }

    @Test
    public void testRentalDaysMovieNullGetter() {
        Movie movie = null;
        Rental rental = new Rental(movie, 0);
        assertEquals(rental.getMovie(), movie);
    }
}
