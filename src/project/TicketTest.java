package project;

public class TicketTest {
    public static void main(String[] args) {
        Ticket ticket = new Ticket("Kalki","30-06-2024","A6","AMB");
        System.out.println(ticket.movieName+ "  "   +  ticket.date + " " + ticket.seatNo );
    }
}
