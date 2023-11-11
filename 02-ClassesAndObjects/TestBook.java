public class TestBook {
    public static void main(String[] args){
        Book book = new Book();
        book.title = "Epiphany";
        book.author_name = "Lianel De Barbarossa";
        book.jounr = "Fantasy";
        book.pages = 3000;
        book.year = 2010;
        book.price = 1200;

        Book book2 = new Book();
        book2.title = "The Mermaid";
        book2.author_name = "Matisenn Austwiz";
        book2.jounr = "Adventure";
        book2.pages = 1203;
        book2.year = 2014;
        book2.price = 203;

        book.showAuthor();
        book.showName();
        book.openBook();
        book.showCurrentPage();
        book.readPage();
        book.closeBook();
        book.showCurrentPage();
        book.openBook();
        book.showCurrentPage();
        book.readPage();

        book2.showAuthor();
        book2.showName();
        book2.openBook();
        book2.showCurrentPage();
        book2.readPage();
        book2.closeBook();
        book2.showCurrentPage();
    
    }
}
