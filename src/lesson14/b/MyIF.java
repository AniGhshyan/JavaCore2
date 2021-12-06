package lesson14.b;

public interface MyIF {
    int getNumber();

    default String getString() {
        return "default String";
    }
}
