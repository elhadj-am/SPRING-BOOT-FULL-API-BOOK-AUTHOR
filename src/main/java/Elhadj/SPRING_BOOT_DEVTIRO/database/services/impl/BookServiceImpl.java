package Elhadj.SPRING_BOOT_DEVTIRO.database.services.impl;

import Elhadj.SPRING_BOOT_DEVTIRO.database.domain.entities.BookEntity;
import Elhadj.SPRING_BOOT_DEVTIRO.database.repositories.BookRepository;
import Elhadj.SPRING_BOOT_DEVTIRO.database.services.BookService;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public BookEntity createBook(String isbn, BookEntity book) {
        book.setIsbn(isbn);
        return bookRepository.save(book);
    }
}
