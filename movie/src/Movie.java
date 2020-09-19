public class Movie {
    public static final int CHILDREN =2;
    public static final int REGULAR =0;
    public static final int NEW_RELEASE=1;

    private String _title;
    private int _priceCode;

    public Movie(String Title, int priceCode){
        _title= Title;
        _priceCode = priceCode;
    }
    public int getPriceCode(){
        return _priceCode;
    }
    public void setPriceCode(int arg){
        _priceCode=arg;

    }
    public String getTitle(){
        return _title;
    }
}