import java.util.ArrayList;
public class Library {
    ArrayList<Book> books = new ArrayList<>();
    
    public void display(){
        for (Book i : books){
            i.display();
        }
    }
    public static void main(String[] args) {
        
    }
}