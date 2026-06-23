package Level2;

public class MovieTicketBooking {
    static class MovieTicket {
        private String movieName;
        private String seatNumber;
        private double price;
        private boolean booked;

        public MovieTicket(String movieName) {
            this.movieName = movieName;
            this.seatNumber = "";
            this.price = 0.0;
            this.booked = false;
        }

        public void bookTicket(String seatNumber, double price) {
            if (booked) {
                System.out.println("[ERROR] Seat already booked: " + this.seatNumber);
                return;
            }
            this.seatNumber = seatNumber;
            this.price = price;
            this.booked = true;
            System.out.println("Booked seat " + seatNumber + " for '" + movieName + "' at Rs." + String.format("%.2f", price));
        }

        public void displayTicket() {
            System.out.println("Movie: " + movieName);
            System.out.println("Seat: " + (booked ? seatNumber : "(not booked)"));
            System.out.println("Price: Rs." + String.format("%.2f", price));
            System.out.println();
        }
    }

    public static void main(String[] args) {
        MovieTicket t = new MovieTicket("Interstellar");
        t.displayTicket();
        t.bookTicket("B12", 250.00);
        t.displayTicket();
    }
}
