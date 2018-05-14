class Rental {
    private final Movie movie;
    private final int daysRented;
    
    public Rental(Movie newMovie, int newDaysRented) {
        movie = newMovie;
        daysRented = newDaysRented;
    }
    
    public int getDaysRented() {
        return daysRented;
    }
    
    public Movie getMovie() {
        return movie;
    }

    double getCharge() {
        return getMovie().getCharge(daysRented);
    }

    int getFrequentRenterPoints() {
        return getMovie().getFrequentRenterPoints(daysRented);
    }
}