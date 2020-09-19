public class Rental {
    private Movie _movie;
    private int _daysRented;

    public Rental(Movie movie, int daysRented){
        _movie= movie;
        _daysRented= daysRented;
    }
    public int getDaysRented(){
        return _daysRented;
    }
    public Movie getMovie(){
        return _movie;
    }

    //determines amount for each line
     double getCharge() {
        double result = 0;
        switch(getMovie().getPriceCode())
        {
            case Movie.REGULAR:
                result +=2;
                if (getDaysRented()>2)
                    result += (getDaysRented()-2)*1.2;
                break;
            case Movie.NEW_RELEASE:
                result += getDaysRented()*3;
                break;

            case Movie.CHILDREN:
                result +=1.5;
                if (getDaysRented()>3)
                    result +=(getDaysRented()-3)*1.5;
                break;
        }
        return result;
    }
     int getFrequentRenterPoints() {

        if((getMovie().getPriceCode()== Movie.NEW_RELEASE)&& getDaysRented()>1)
            return 2;
        else
            return 1;
    }
}