package lesson13;

public class Dispatch {
    public static void main(String[] args) {
        A2 a2 = new A2();
        B2 b2 = new B2();
        C2 c2 = new C2();
        A2 r;
        r = a2;
        r.callme();
        r = b2;
        r.callme();
        r = c2;
        r.callme();
    }
}
