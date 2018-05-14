import java.util.Enumeration;
import java.util.Vector;

class Customer {
    private final String name;
    private final Vector<Rental> rentals = new Vector<>();
    
    public Customer (String newName){
        name = newName;
    }
    
    public void addRental(Rental arg) {
        rentals.addElement(arg);
    }
    
    public String getName (){
        return name;
    }
    
    public String statement() {
        double totalAmount = 0;
        int frequentRenterPoints = 0;
        Enumeration enum_rentals = rentals.elements();	    
        StringBuilder result = new StringBuilder("Rental Record for " + this.getName() + "\n");
        result.append("\t" + "Title" + "\t" + "\t" + "Days" + "\t" + "Amount" + "\n");

        while (enum_rentals.hasMoreElements()) {
            Rental each = (Rental) enum_rentals.nextElement();
            frequentRenterPoints++;
            if ((each.getMovie().getPriceCode() == Movie.NEW_RELEASE) && each.getDaysRented() > 1)
                frequentRenterPoints++;
            result.append("\t").append(each.getMovie().getTitle()).append("\t").append("\t").append(each.getDaysRented()).append("\t").append(String.valueOf(thisAmount)).append("\n");
            totalAmount += each.getCharge();
        }
        //add footer lines
        result.append("Amount owed is ").append(String.valueOf(totalAmount)).append("\n");
        result.append("You earned ").append(String.valueOf(frequentRenterPoints)).append(" frequent renter points");
        return result.toString();
    }
}
    