package libapp;

import java.util.ArrayList;

public class BookRepository {
    private ArrayList<Book> books = new ArrayList<Book>();


    public BookRepository() {
        books.add(new Book("12345", "Joys of Motherhood", "Tragedy", null, "Buchi Emecheta"));
        books.add(new Book("23456", "Silas Mana", "Love", null, "George Elliot"));
        books.add(new Book("34567", "Romeo & Juliet", "Love", null, "Shakespeare"));
        books.add(new Book("45678", "Hamlet", "Love", null, "Shakespeare"));
        books.add(new Book("56789", "Angels & Demons", "Thriller", null, "Dan Brown"));
        books.add(new Book("67890", "Animal Farm", "Fantasy", null, "George Orwell"));
        books.add(new Book("78901", "NYSC Guide", "Scam", null, "NYSC"));
    }

    public Book findByIsbn(String isbn) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                return book;
            }
        }
        return null;
    }
}
