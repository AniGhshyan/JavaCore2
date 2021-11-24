package lesson13;

public class B1 extends A1 {
    int k;

    B1(int a, int b, int c) {
        super(a, b);
        k = c;
    }

//    void show() {
//        super.show();
//        System.out.println("k: " + k);
//    }

    void show(String msg) {
        System.out.println(msg + k);
    }
}
