package lesson20.thread;

public class ExtendThread {
    public static void main(String[] args) {
        new NewThread();
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Глaвный поток: " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Глaвный поток прерван.");
        }
        System.out.println("Глaвный поток завершен.");
    }
}
