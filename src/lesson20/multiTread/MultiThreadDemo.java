package lesson20.multiTread;

public class MultiThreadDemo {
    public static void main(String[] args) {
        new NewThread("Oдин");
        new NewThread("Два");
        new NewThread("Три");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            System.out.println("Глaвный поток прерван");
        }
        System.out.println("Глaвный поток завершен.");
    }
}
