package lesson14.p2;

public class NestedIfDemo {
    public static void main(String[] args) {
        A.NestedIF nif = new B();
        if (nif.isNotNegative(10)) {
            System.out.println("10 > 0");
        }
        if (nif.isNotNegative(-12)) {
            System.out.println("-12 < 0");
        }
    }
}