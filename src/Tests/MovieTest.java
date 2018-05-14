import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MovieTest {

    @Test
    public void testMovieTitleGetter() {
        String title = "Titel";
        Movie movie = new Movie(title, Movie.NEW_RELEASE);
        assertEquals(movie.getTitle(), title);
    }

    @Test
    public void testMovieTitleEmptyGetter() {
        String title = "";
        Movie movie = new Movie(title, Movie.NEW_RELEASE);
        assertEquals(movie.getTitle(), title);
    }

    @Test
    public void testMoviePriceCodeGetter() {
        int priceCode = Movie.REGULAR;
        Movie movie = new Movie("", priceCode);
        assertEquals(movie.getPriceCode(), priceCode);
    }

    @Test
    public void testMoviePriceCodeNegativeGetter() {
        int priceCode = -1;
        Movie movie = new Movie("", priceCode);
        assertEquals(movie.getPriceCode(), priceCode);
    }

    @Test
    public void testMoviePriceCodeSetter() {
        int priceCode = Movie.REGULAR;
        Movie movie = new Movie("", Movie.CHILDREN);
        movie.setPriceCode(priceCode);
        assertEquals(movie.getPriceCode(), priceCode);
    }
}
