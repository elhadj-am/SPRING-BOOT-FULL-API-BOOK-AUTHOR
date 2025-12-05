package Elhadj.SPRING_BOOT_DEVTIRO.database.controllers;

import Elhadj.SPRING_BOOT_DEVTIRO.database.domain.dto.BookDto;
import Elhadj.SPRING_BOOT_DEVTIRO.database.domain.entities.BookEntity;
import Elhadj.SPRING_BOOT_DEVTIRO.database.mappers.Mapper;
import Elhadj.SPRING_BOOT_DEVTIRO.database.services.BookService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class BookController {

    private Mapper<BookEntity, BookDto> bookMapper;

    private BookService bookService;

    public BookController(Mapper<BookEntity, BookDto> bookMapper, BookService bookService) {
        this.bookMapper = bookMapper;
        this.bookService = bookService;
    }

    @PutMapping("/books/{isbn}")
    public ResponseEntity<BookDto> createBook(
            @PathVariable("isbn") String isbn,
            @RequestBody BookDto bookDto) {
        BookEntity bookEntity = bookMapper.mapFrom(bookDto);
        BookEntity savedBookEntity = bookService.createBook(isbn, bookEntity);
        BookDto savedBookDto = bookMapper.mapTo(savedBookEntity);
        return new ResponseEntity<>(savedBookDto, HttpStatus.CREATED);
    }

}
