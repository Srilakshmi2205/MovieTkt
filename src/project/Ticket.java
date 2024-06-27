package project;

public class Ticket {
    public String movieName;
    public String date;
    public String seatNo;
    public String theaterName;

    public Ticket(String movieName, String date, String seatNo, String theaterName) {
        this.movieName = movieName;
        this.date = date;
        this.seatNo = seatNo;
        this.theaterName = theaterName;


    }
    public String getMovieName(){
        return movieName;
    }
    public String getDate(){
        return date;
    }
    public String getSeatNo(){
        return seatNo;
    }
    public String getTheaterName(){
        return theaterName;
    }

}
