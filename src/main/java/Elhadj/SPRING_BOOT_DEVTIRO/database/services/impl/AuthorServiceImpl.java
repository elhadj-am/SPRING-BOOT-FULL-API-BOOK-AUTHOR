package Elhadj.SPRING_BOOT_DEVTIRO.database.services.impl;

import Elhadj.SPRING_BOOT_DEVTIRO.database.domain.entities.AuthorEntity;
import Elhadj.SPRING_BOOT_DEVTIRO.database.repositories.AuthorRepository;
import Elhadj.SPRING_BOOT_DEVTIRO.database.services.AuthorService;
import org.springframework.stereotype.Service;

@Service
public class AuthorServiceImpl implements AuthorService {

    AuthorRepository authorRepository;

    public AuthorServiceImpl(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @Override
    public AuthorEntity createAuthor(AuthorEntity authorEntity) {
        return authorRepository.save(authorEntity);
    }
}
