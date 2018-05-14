import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CustomerTest {

    @Test
    public void testCustomerName() {
        String name = "Peter";
        Customer myCustomer = new Customer(name);

        assertEquals(myCustomer.getName(), name);
    }

    @Test
    public void testCustomerNameEmpty() {
        String name = "";
        Customer myCustomer = new Customer(name);

        assertEquals(myCustomer.getName(), name);
    }

    @Test
    public void testCustomerStatementEmpty() {
        Customer myCustomer = new Customer("");
        assertEquals(myCustomer.statement().split("\n").length, 4);
    }

    @Test
    public void testCustomerStatementRental() {
        Customer myCustomer = new Customer("");
        myCustomer.addRental(new Rental(new Movie("", 1), 1));
        assertEquals(myCustomer.statement().split("\n").length, 5);
    }
}
