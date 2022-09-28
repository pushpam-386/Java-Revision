import java.io.Serializable;
import java.util.Objects;

public class Books implements Serializable {
    private int isbn;
    private String bookName;
    private String author;

    public Books() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Books books = (Books) o;
        return isbn == books.isbn && Objects.equals(bookName, books.bookName) && Objects.equals(author, books.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isbn, bookName, author);
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
