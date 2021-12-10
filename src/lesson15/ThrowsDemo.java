package lesson15;

public class ThrowsDemo {
    static void throwOne() throws IllegalAccessException {
        System.out.println("в теле метода throwOne().");
        throw new IllegalAccessException("думонстрация");
    }

    public static void main(String[] args) {
        try {
            throwOne();
        } catch (IllegalAccessException e) {
            System.out.println(" перехвачено исключение " + e);
        }

    }

}
