package FlightReservationSystem;

public class Main {
    public static void main(String[] args) {
        Ticket regularTicket = new RegularTicket("23432", "Delhi",
                "Pune", "DepartureDateTime", "ArrivalDateTime",
                "12AX", 3499, false, null, null, "Dinner");

        Ticket touristTicket = new TouristTicket("32423", "India", "Canada",
                "DepartureDateTime", "ArrivalDateTIme",
                "43R", 99000, false, null, null,
                "Dubai Hotel", new String[]{""});

        printTicketDetails(regularTicket);
        printTicketDetails(touristTicket);
    }

    public static void printTicketDetails(Ticket ticket) {
        System.out.println(ticket.getPnr());
    }
}
