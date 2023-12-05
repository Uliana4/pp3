public class Audiobook extends Book{
    int minutes;
    int seconds;

    public Audiobook(String title, String author, String publisher, int minutes, int seconds) {
        super(title, author, publisher);
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public void display(){
        System.out.println("Book title: " + title + ", Book author: " + author + ", Publisher: " + publisher +", Audio book duration: " + minutes + " minutes and " + seconds + " seconds");
    }

    public static void main(String[] args) {
        Audiobook b1 = new Audiobook("Sea", "Lucky", "Cube", 12, 23);
        b1.display();
        
        Audiobook b2 = new Audiobook("Ocean","Sweets", "Amazon",187, 12);
        b2.display();

        Book b3 = new Book("Garage", "T.Breddy", "Amazon");
        b3.display();
    }
    
}
