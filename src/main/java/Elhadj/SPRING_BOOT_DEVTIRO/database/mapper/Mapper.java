package Elhadj.SPRING_BOOT_DEVTIRO.database.mapper;

public interface Mapper <A,B> {
    B mapTo(A a);
    A mapFrom(B b);
}
