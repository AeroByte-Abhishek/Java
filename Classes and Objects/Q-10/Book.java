class BookInfo{
    private int bookId;
    double price;
    String title, author;

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }
    public int getBookId() {
        return bookId;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public String getTitle() {
        return title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    public String getAuthor() {
        return author;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public double getPrice() {
        return price;
    }


    public void showBookInfo(){
        System.out.println("Book Id: " + bookId);
        System.out.println("Title of the book is: " + title);
        System.out.println("Author of the book is: " + author);
        System.out.println("Price of the book is: " + price);
    }
}

public class Book {

    public static void main(String[] args) {
        BookInfo b1 = new BookInfo();
        b1.setBookId(01);
        b1.setTitle("A phone call from GOD");
        b1.setAuthor("Khamosh Kalam");
        b1.setPrice(55555);
        b1.showBookInfo();
    }
}