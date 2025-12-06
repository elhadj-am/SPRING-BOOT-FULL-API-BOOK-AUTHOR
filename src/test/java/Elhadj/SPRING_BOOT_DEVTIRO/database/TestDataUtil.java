package Elhadj.SPRING_BOOT_DEVTIRO.database;

import Elhadj.SPRING_BOOT_DEVTIRO.database.domain.dto.AuthorDto;
import Elhadj.SPRING_BOOT_DEVTIRO.database.domain.dto.BookDto;
import Elhadj.SPRING_BOOT_DEVTIRO.database.domain.entities.AuthorEntity;
import Elhadj.SPRING_BOOT_DEVTIRO.database.domain.entities.BookEntity;

public final class TestDataUtil {

    private TestDataUtil() {
    }

    public static AuthorEntity createTestAuthorA() {
        return AuthorEntity.builder()
                .name("Maria")
                .age(14)
                .build();
    }

    public static AuthorEntity createTestAuthorB() {
        return AuthorEntity.builder()
                .name("Pedro")
                .age(20)
                .build();
    }

    public static AuthorEntity createTestAuthorC() {
        return AuthorEntity.builder()
                .name("Dorothé")
                .age(30)
                .build();
    }



    public static BookEntity createTestBookEntityA(final AuthorEntity authorEntity) {
        return BookEntity.builder()
                .isbn("a1b2")
                .title("Potter")
                .authorEntity(authorEntity)
                .build();
    }


    public static BookDto createTestBookDtoA(final AuthorDto authorDto) {
        return BookDto.builder()
                .isbn("a1b2")
                .title("Potter")
                .author(authorDto)
                .build();
    }

    public static BookEntity createTestBookB(final AuthorEntity authorEntity) {
        return BookEntity.builder()
                .isbn("b1b2")
                .title("The hobbit")
                .authorEntity(authorEntity)
                .build();
    }

    public static BookEntity createTestBookC(final AuthorEntity authorEntity) {
        return BookEntity.builder()
                .isbn("c1b2")
                .title("The hobbit")
                .authorEntity(authorEntity)
                .build();
    }
}
