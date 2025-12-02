package Elhadj.SPRING_BOOT_DEVTIRO.database.mapper.impl;

import Elhadj.SPRING_BOOT_DEVTIRO.database.domain.dto.BookDto;
import Elhadj.SPRING_BOOT_DEVTIRO.database.domain.entities.BookEntity;
import Elhadj.SPRING_BOOT_DEVTIRO.database.mapper.Mapper;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class BookMapperImpl implements Mapper<BookEntity, BookDto> {

    ModelMapper modelMapper ;

    public BookMapperImpl(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    @Override
    public BookDto mapTo(BookEntity bookEntity) {
        return null;
    }

    @Override
    public BookEntity mapFrom(BookDto bookDto) {
        return null;
    }
}
