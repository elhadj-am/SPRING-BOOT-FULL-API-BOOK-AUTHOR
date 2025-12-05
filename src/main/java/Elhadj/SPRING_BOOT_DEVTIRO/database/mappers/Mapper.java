package Elhadj.SPRING_BOOT_DEVTIRO.database.mappers;

public interface Mapper <A,B> {
    B mapTo(A a);
    A mapFrom(B b);
}
