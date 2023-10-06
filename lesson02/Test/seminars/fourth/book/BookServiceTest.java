package seminars.fourth.book;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class BookServiceTest {
    @Test
    public void testFindBookById() {
        BookRepository mockRepository = mock(BookRepository.class);
        when(mockRepository.findById("1")).thenReturn(new Book("1", "My Book", "Me"));
        BookService bookService = new BookService(mockRepository);
        Book result = bookService.findBookById("1");

        assertEquals("My Book", result.getTitle());
        assertEquals("Me", result.getAuthor());
    }

    @Test
    public void testFindAllBooks() {
        BookRepository mockRepository = mock(BookRepository.class);
        when(mockRepository.findAll()).thenReturn(List.of(new Book("1", "My Book", "Me")));
        BookService bookService = new BookService(mockRepository);
        List<Book> result = bookService.findAllBooks();

        assertEquals(1, result.size());
        assertEquals("My Book", result.get(0).getTitle());
        assertEquals("Me", result.get(0).getAuthor());
    }
}