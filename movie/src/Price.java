abstract class Price {
    abstract int getPriceCode();

    //determines amount for each line
   abstract double getCharge(int daysRented);

    int getFrequentRenterPoints(int daysRented) {
        return 1;
    }
}
