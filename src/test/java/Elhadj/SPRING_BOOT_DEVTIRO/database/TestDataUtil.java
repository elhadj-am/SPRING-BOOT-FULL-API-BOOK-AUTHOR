package Elhadj.SPRING_BOOT_DEVTIRO.database;

import Elhadj.SPRING_BOOT_DEVTIRO.database.domain.Author;
import Elhadj.SPRING_BOOT_DEVTIRO.database.domain.Book;

public final class TestDataUtil {

    private TestDataUtil() {
    }

    public static Author createTestAuthorA() {
        return Author.builder()
                .name("Maria")
                .age(14)
                .build();
    }

    public static Author createTestAuthorB() {
        return Author.builder()
                .name("Pedro")
                .age(20)
                .build();
    }

    public static Author createTestAuthorC() {
        return Author.builder()
                .name("Dorothé")
                .age(30)
                .build();
    }



    public static Book createTestBookA(final Author author) {
        return Book.builder()
                .isbn("a1b2")
                .title("Potter")
                .author(author)
                .build();
    }

    public static Book createTestBookB(final Author author) {
        return Book.builder()
                .isbn("b1b2")
                .title("The hobbit")
                .author(author)
                .build();
    }

    public static Book createTestBookC(final Author author) {
        return Book.builder()
                .isbn("c1b2")
                .title("The hobbit")
                .author(author)
                .build();
    }
}
