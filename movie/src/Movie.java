public class Movie {
    public static final int CHILDREN =2;
    public static final int REGULAR =0;
    public static final int NEW_RELEASE=1;

    private String _title;
    private Price _price;

    public Movie(String Title, int priceCode) throws IllegalAccessException {
        _title= Title;
        setPriceCode(priceCode);
    }
    public int getPriceCode(){
        return _price.getPriceCode();
    }
    public void setPriceCode(int arg) throws IllegalAccessException {
        switch(arg)
        {
            case REGULAR:
                _price = new RegularPrice();
                break;
            case NEW_RELEASE:
                _price = new NewReleasePrice();
                break;

            case CHILDREN:
                _price = new ChildrenPrice();
                break;

            default:
                throw new IllegalAccessException("Incorrect Price Code");
        }
    }

    double getCharge (int daysRented){
        return _price.getCharge(daysRented);
    }
    public String getTitle(){
        return _title;
    }

    int getFrequentRenterPoints(int daysRented) {

        return _price.getFrequentRenterPoints(daysRented);
    }
}
