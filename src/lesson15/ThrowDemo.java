package lesson15;

public class ThrowDemo {
    static void demoproc() {
        try {
            throw new NullPointerException("думонстрация");
        } catch (NullPointerException e) {
            System.out.println("исключение перехвачено в теле метода demoproc().");
            throw e;
        }
    }

    public static void main(String[] args) {
        try {
            demoproc();
        } catch (NullPointerException e) {
            System.out.println("повторный перехват " + e);
        }
    }
}
