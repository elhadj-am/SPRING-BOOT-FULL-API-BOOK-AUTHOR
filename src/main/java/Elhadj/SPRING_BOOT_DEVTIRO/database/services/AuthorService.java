package Elhadj.SPRING_BOOT_DEVTIRO.database.services;

import Elhadj.SPRING_BOOT_DEVTIRO.database.domain.entities.AuthorEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AuthorService {

    AuthorEntity createAuthor(AuthorEntity authorEntity);

    List<AuthorEntity> findAll();

}
