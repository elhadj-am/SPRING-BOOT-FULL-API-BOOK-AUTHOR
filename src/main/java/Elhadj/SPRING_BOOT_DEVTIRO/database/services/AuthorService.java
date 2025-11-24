package Elhadj.SPRING_BOOT_DEVTIRO.database.services;

import Elhadj.SPRING_BOOT_DEVTIRO.database.domain.entities.AuthorEntity;
import org.springframework.stereotype.Service;

@Service
public interface AuthorService {
    AuthorEntity createAuthor(AuthorEntity authorEntity);
}
