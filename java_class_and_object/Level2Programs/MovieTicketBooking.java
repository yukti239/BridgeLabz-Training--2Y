public class MovieTicketBooking {
    String movieName;
    int seatNumber;
    double price;
    
    MovieTicketBooking(String movieName, int seatNumber, double price) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
    }
    
    void bookTicket(int seat, double ticketPrice) {
        this.seatNumber = seat;
        this.price = ticketPrice;
        System.out.println("Ticket booked: Seat " + seatNumber + ", Price: " + price);
    }
    
    void displayTicket() {
        System.out.println("Movie: " + movieName);
        System.out.println("Seat: " + seatNumber);
        System.out.println("Price: " + price);
    }
    
    public static void main(String[] args) {
        MovieTicketBooking ticket = new MovieTicketBooking("Avengers", 0, 0);
        ticket.bookTicket(12, 250);
        ticket.displayTicket();
    }
}