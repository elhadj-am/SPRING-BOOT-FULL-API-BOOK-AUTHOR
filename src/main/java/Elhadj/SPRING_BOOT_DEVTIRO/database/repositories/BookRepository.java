package Elhadj.SPRING_BOOT_DEVTIRO.database.repositories;

import Elhadj.SPRING_BOOT_DEVTIRO.database.domain.entities.BookEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends CrudRepository<BookEntity, String> {
}
