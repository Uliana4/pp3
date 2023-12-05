public class Ebook extends Book {
    private String fileName;

    public Ebook(String title, String author, String publisher, String fileName) {
        super(title, author, publisher);
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public void display(){
        System.out.println("Book title: " + title + ", Book author: " + author + ", Publisher: " + publisher + ", E-book file name: " + fileName);
    }

    public static void main(String[] args) {
        Ebook b1 = new Ebook("Maja in the garden", "K.L.Mackey", "Amazon", "Hi");
        b1.display();
        
        Ebook b2 = new Ebook("My dear tree","K.L.Mackey", "Cube", "Bye");
        b2.display();

        Book b3 = new Book("May day", "K.L.Lacky", "Cube");
        b3.display();
    }
}