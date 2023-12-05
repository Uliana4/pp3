public class Book {
    protected String title;
    protected String author;
    protected String publisher;

    public Book(String title, String author, String publisher) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void display(){
        System.out.println("Book title: " + title + ", Book author: " + author + ", Publisher :" + publisher);
    }

    public static void main(String[] args) {
        Book b1 = new Book("GameOfThrones", "J.K.Lala", "Amazon");
        b1.display();
        
        Book b2 = new Book("SqueedGame", "J.S.Kala", "Cube");
        b2.display();
    }
}
