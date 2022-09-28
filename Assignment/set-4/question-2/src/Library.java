import java.awt.print.Book;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Library implements Serializable {
    List<Books> bookList = new ArrayList<>();
    void addBook(Books book){
        bookList.add(book);
    }

    boolean isEmpty(){
        if(bookList==null){
            return true;
        }
        else {
            return false;
        }
    }

    List<Books> viewAllBooks(){
        return bookList;
    }

    List<Books> viewBooksByAuthor(String author ){
        if (bookList.contains(new Books().getAuthor()==author)){
            return bookList;
        }
        return bookList;
    }

    int countNoOfBook(String bookName){
        if (bookList.contains(new Books().getBookName()==bookName)){

        }

    }
}
