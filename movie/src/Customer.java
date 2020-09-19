import java.util.Enumeration;
import java.util.Vector;

public class Customer {
    private String _name;
    private Vector _rentals = new Vector();

    public Customer(String name){
        _name=name;
    }
    public void addRental(Rental arg){
        _rentals.addElement(arg);
    }
    public String getName(){
        return _name;
    }
    public String statment(){
        int frequentRenterPoints=0;
        Enumeration rentals= _rentals.elements();
        String result ="Rental Record for "+ getName()+"\n";

        while(rentals.hasMoreElements()){
            Rental each = (Rental) rentals.nextElement();
            frequentRenterPoints += each.getFrequentRenterPoints();

            //show figures for this rental
            result += "\t" + each.getMovie().getTitle()+"\t"+
                    String.valueOf(each.getCharge())+"\n";

        }
        //add footer lines
        result+= "Amount owned is "+ String.valueOf(getTotalFrequentRenterPoints())+"\n";
        result+="You earned"+ String.valueOf(getTotalFrequentRenterPoints())+ "frequent renter points";
        return result;
    }

    private double getTotalFrequentRenterPoints() {
        double result =0;
        Enumeration rentals= _rentals.elements();
        while (rentals.hasMoreElements()){
            Rental each = (Rental) rentals.nextElement();
            result+=each.getCharge();
        }
        return result;



    }

    public String htmlStatment(){
        Enumeration rentals = _rentals.elements();
        String result ="<H1> Rentals for <EM>"+ getName()+"</EM></H1><P>\n";
        while (rentals.hasMoreElements()){
            Rental each = (Rental) rentals.nextElement();
            //show figures for each rental
            result+=each.getMovie().getTitle()+ " : " +
                    String.valueOf(each.getCharge())+"<BR>\n";
        }
        //add footer
        result+= "<P> You Owe <EM> "+ String.valueOf(getTotalFrequentRenterPoints())+"</EM><P>\n";
        result+="On this rental you earned <EM>"+ String.valueOf(getTotalFrequentRenterPoints())+ "frequent renter points";
        return result;

    }


}
