package Elhadj.SPRING_BOOT_DEVTIRO.database.domain.dto;


import Elhadj.SPRING_BOOT_DEVTIRO.database.domain.entities.AuthorEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BookDto {

    private String isbn;

    private String title;

    private AuthorEntity authorEntity;
}
