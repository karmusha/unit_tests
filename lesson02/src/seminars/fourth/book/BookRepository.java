package seminars.fourth.book;

import java.util.List;

public interface BookRepository {
    // Этот класс будем потом использовать для мока.
    
    Book findById(String id);
    List<Book> findAll();
}
