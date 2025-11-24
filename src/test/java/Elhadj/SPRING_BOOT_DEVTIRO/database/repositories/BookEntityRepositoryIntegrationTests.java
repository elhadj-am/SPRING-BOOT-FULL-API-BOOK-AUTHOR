package Elhadj.SPRING_BOOT_DEVTIRO.database.repositories;

import Elhadj.SPRING_BOOT_DEVTIRO.database.TestDataUtil;
import Elhadj.SPRING_BOOT_DEVTIRO.database.domain.entities.AuthorEntity;
import Elhadj.SPRING_BOOT_DEVTIRO.database.domain.entities.BookEntity;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@ExtendWith(SpringExtension.class)
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_EACH_TEST_METHOD)
public class BookEntityRepositoryIntegrationTests {

    private BookRepository underTest;

    @Autowired
    public BookEntityRepositoryIntegrationTests(BookRepository underTest ) {
        this.underTest = underTest;
    }


   @Test
   @Transactional
    public void testThatBookCanBeCreatedAndRecalled() {

        AuthorEntity authorEntity = TestDataUtil.createTestAuthorA();
        BookEntity bookEntity = TestDataUtil.createTestBookA(authorEntity);
        underTest.save(bookEntity);

        Optional<BookEntity> result = underTest.findById(bookEntity.getIsbn());
        assertThat(result).isPresent();
        assertThat(result.get().getAuthorEntity().getName()).isEqualTo(authorEntity.getName());
//        assertThat(result.get()).isEqualTo(bookEntity);
    }



    @Test
    @Transactional
    public void testThatMultipleBooksCanBeCreatedAndRecalled() {
        AuthorEntity authorEntity = TestDataUtil.createTestAuthorA();

        BookEntity bookEntityA = TestDataUtil.createTestBookA(authorEntity);
        BookEntity bookEntityB = TestDataUtil.createTestBookB(authorEntity);
        BookEntity bookEntityC = TestDataUtil.createTestBookC(authorEntity);

        underTest.save(bookEntityA);
        underTest.save(bookEntityB);
        underTest.save(bookEntityC);

        ArrayList<BookEntity> bookEntities = new ArrayList<>();
        bookEntities.add(bookEntityA);
        bookEntities.add(bookEntityB);
        bookEntities.add(bookEntityC);

        Iterable<BookEntity> result = underTest.findAll();
        assertThat(result)
                .hasSize(3)
                .usingRecursiveComparison()
                .ignoringFields("author.id")
                .isEqualTo(bookEntities);
    }

    @Test
    @Transactional
    public void testThatBookCanBeUpdatedAndRecalled() {
        AuthorEntity authorEntity = TestDataUtil.createTestAuthorA();
        BookEntity bookEntityA = TestDataUtil.createTestBookA(authorEntity);

        underTest.save(bookEntityA);

        bookEntityA.setTitle("Updated Title");
        underTest.save(bookEntityA);

        Optional<BookEntity> result = underTest.findById(bookEntityA.getIsbn());
        assertThat(result).isPresent();

        assertThat(result.get())
                .usingRecursiveComparison()
                .ignoringFields("author.id")
                .isEqualTo(bookEntityA);
    }
    @Test
    @Transactional
    public void testThatBookCanBeDeletedAndRecalled() {
        AuthorEntity authorEntity = TestDataUtil.createTestAuthorA();
        BookEntity bookEntityA = TestDataUtil.createTestBookA(authorEntity);
        underTest.save(bookEntityA);

        underTest.deleteById(bookEntityA.getIsbn());
        Optional<BookEntity> result = underTest.findById(bookEntityA.getIsbn());
        assertThat(result).isNotPresent();
    }
}
