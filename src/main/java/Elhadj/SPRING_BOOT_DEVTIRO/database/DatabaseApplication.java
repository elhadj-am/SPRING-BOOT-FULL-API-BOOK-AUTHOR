package Elhadj.SPRING_BOOT_DEVTIRO.database;

import lombok.extern.java.Log;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication
@Component
@Log
public class DatabaseApplication{

    public static void main(String[] args) {
        SpringApplication.run(DatabaseApplication.class, args); }
}



