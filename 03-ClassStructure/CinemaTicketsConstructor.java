public class CinemaTicketsConstructor {
    static String cinemaName = "Morning Star Cinema";
    String filmTitle;
    int row;
    int seat;
    double price;

    public String toString() {
        return "CinemaTicket in " + cinemaName + " : [filmTitle=" + filmTitle + ", row=" + row + ", seat=" + seat + ", price=" + price + "]";
    }

    public CinemaTicketsConstructor(String filmTitle, int row, int seat) {
        this.filmTitle = filmTitle;
        this.row = row;
        this.seat = seat;

        if (row>2){
            this.price = 25;
        } else {
            this.price = 10;
        }
    }

    public static void main(String[] args){
        CinemaTicketsConstructor ticket1 = new CinemaTicketsConstructor("One day in May", 2, 15);
        CinemaTicketsConstructor ticket2 = new CinemaTicketsConstructor("In the ocean", 7, 3);
        System.out.println(ticket1);
        System.out.println(ticket2);
    }
    
}
