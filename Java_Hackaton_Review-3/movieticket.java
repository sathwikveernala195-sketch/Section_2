
class CinemaBooking {
    String customerName, movieName;
    double ticketPrice;
    int tickets;

    // Default constructor
    CinemaBooking() {
        customerName = "ARJUN";
        movieName = "AVATAR";
        ticketPrice = 200;
        tickets = 2;
    }

    // Parameterized constructor
    CinemaBooking(String c, String m, double p, int t) {
        customerName = c;
        movieName = m;
        ticketPrice = p;
        tickets = t;
    }

    // Method overloading
    void bookTickets(int t) {
        tickets = t;
        display();
    }

    void bookTickets(String c, int t) {
        customerName = c;
        tickets = t;
        display();
    }

    void display() {
        System.out.println("\nCustomer Name   : "
                + customerName.toUpperCase());
        System.out.println("Movie Name      : "
                + movieName.toUpperCase());

        if (tickets <= 0) {
            System.out.println("Booking Status  : Invalid number of tickets");
            return;
        }

        double total = ticketPrice * tickets;
        double discount = 0;

        if (tickets >= 5) {
            discount = total * 0.10;
        }

        double finalAmount = total - discount;

        System.out.printf("Ticket Price    : Rs. %.2f%n", ticketPrice);
        System.out.println("Number of Tickets: " + tickets);
        System.out.println("Booking Status  : Booking Successful");
        System.out.printf("Total Amount    : Rs. %.2f%n", total);
        System.out.printf("Discount        : Rs. %.2f%n", discount);
        System.out.printf("Final Amount    : Rs. %.2f%n", finalAmount);
    }

    public static void main(String[] args) {
        System.out.println("====== CINEMA TICKET BOOKING ======");

        // Parameterized constructor
        CinemaBooking b1 = new CinemaBooking("Sneha", "Avatar", 200, 5);
        b1.display();

        // Default constructor
        CinemaBooking b2 = new CinemaBooking();
        b2.display();

        // Compare customer names
        System.out.println("\nCustomer names are equal: "
                + b1.customerName.equalsIgnoreCase(b2.customerName));
    }
}
