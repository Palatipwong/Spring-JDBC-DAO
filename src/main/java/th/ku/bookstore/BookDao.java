package th.ku.bookstore;

import java.util.List;
import th.ku.bookstore.Book;

public interface BookDao {
    void save(Book book);
    void update(int id, Book book);
    void deleteById(int id);
    Book findById(int id);
    List<Book> findAll();

}
