package lesson20.flag;

public class SuspendResume {
    public static void main(String[] args) {
        NewThread ob1 = new NewThread("Один");
        NewThread ob2 = new NewThread("Два");
        try {
            Thread.sleep(1000);
            ob1.mysuspend();
            System.out.println("Пpиocтaнoвкa потока Один");
            Thread.sleep(1000);
            ob1.myresume();
            System.out.println("Boзoбнoвлeниe потока Один");
            ob2.mysuspend();
            System.out.println("Пpиocтaнoвкa потока Два");
            Thread.sleep(1000);
            ob2.myresume();
            System.out.println("Boзoбнoвлeниe потока Два");
        } catch (InterruptedException e) {
            System.out.println("Глaвный поток прерван");
        }
        try {
            System.out.println("Oжидaниe завершения потоков.");
            ob1.t.join();
            ob2.t.join();
        } catch (InterruptedException e) {
            System.out.println("Глaвный поток прерван");
        }
        System.out.println("Глaвный поток завершен");
    }
}
