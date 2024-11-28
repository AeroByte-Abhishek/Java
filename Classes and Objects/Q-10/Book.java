class BookInfo{
    int bookId, price;
    String title, author;

    void setBookId(int bookId) {
        this.bookId = bookId;
    }
    int getBookId() {
        return bookId;
    }

    void setTitle(String title) {
        this.title = title;
    }
    String getTitle() {
        return title;
    }

    void setAuthor(String author) {
        this.author = author;
    }
    String getAuthor() {
        return author;
    }

    void setPrice(int price) {
        this.price = price;
    }
    int getPrice() {
        return price;
    }


    void showBookInfo(){
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