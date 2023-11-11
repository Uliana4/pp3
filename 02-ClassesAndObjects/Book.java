public class Book {
    String title;
    String author_name;
    int year;
    String jounr;
    int pages;
    int price;
    int currentPage = 0;
    boolean isOpen = false;

    void openBook(){
        String openStatus = isOpen ? "Book already open" : "Book has been open";
        if (isOpen != true){
            isOpen = true;
        }
        System.out.println(openStatus);
    }

    void closeBook(){
        if (isOpen = true){
            isOpen = false;
        }
        System.out.println("Book is already closed");
    }

    void showName(){
        System.out.println("Name of the book: " + title);
    }

    void showAuthor(){
        System.out.println("Author: " + author_name);
    }

    void showCurrentPage(){
        if (isOpen){
            System.out.println("Current page: " + currentPage);
        } else {
            System.out.println("You need to open the book first");
        }
    }

    void readPage(){
        currentPage+=1;
        System.out.println("You have read one page");
    }
}
