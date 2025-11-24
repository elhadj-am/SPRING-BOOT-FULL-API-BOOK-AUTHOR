package Elhadj.SPRING_BOOT_DEVTIRO.database.mapper.impl;

import Elhadj.SPRING_BOOT_DEVTIRO.database.domain.dto.AuthorDto;
import Elhadj.SPRING_BOOT_DEVTIRO.database.domain.entities.AuthorEntity;
import Elhadj.SPRING_BOOT_DEVTIRO.database.mapper.Mapper;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class AuthorMapperImpl implements Mapper<AuthorEntity, AuthorDto> {

    private ModelMapper modelMapper;

    public AuthorMapperImpl(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    @Override
    public AuthorDto mapTo(AuthorEntity authorEntity) {
        return modelMapper.map(authorEntity, AuthorDto.class);
    }

    @Override
    public AuthorEntity mapFrom(AuthorDto authorDto) {
        return modelMapper.map(authorDto, AuthorEntity.class);
    }
}
