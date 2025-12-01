package Elhadj.SPRING_BOOT_DEVTIRO.database.services;

import Elhadj.SPRING_BOOT_DEVTIRO.database.domain.entities.BookEntity;

public interface BookService {
    BookEntity createBook(String isbn, BookEntity book);
}
