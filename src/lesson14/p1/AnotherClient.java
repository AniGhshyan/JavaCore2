package lesson14.p1;

public class AnotherClient implements Callback {
    public void callback(int p) {
        System.out.println("method callback 1");
        System.out.println("sqr p = " + (p * p));
    }
}
