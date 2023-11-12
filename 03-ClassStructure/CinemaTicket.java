public class CinemaTicket {
    static String cinemaName = "Aurora";
    String filmTitle;
    int row;
    int seat;
    double price;

    @Override
    public String toString() {
        return "CinemaTicket in Cinema " + cinemaName + " : [filmTitle=" + filmTitle + ", row=" + row + ", seat=" + seat + ", price=" + price + "]";
    }

    public static void main(String[] args){
        CinemaTicket ticket1 = new CinemaTicket();
        ticket1.filmTitle = "Gladiator";
        ticket1.row = 12;
        ticket1.seat = 25;
        ticket1.price = 48.92;

        CinemaTicket ticket2 = new CinemaTicket();
        ticket2.filmTitle = "Viral";
        ticket2.row = 4;
        ticket2.seat = 15;
        ticket2.price = 36.54;

        System.out.println(ticket1);
        System.out.println(ticket2);
    }
}
