package lesson16;

public class EnumDemo3 {
    public static void main(String[] args) {
        Apple1 ap;
        System.out.println("яблокo сорта Winesap стоит " + Apple1.Winesap.getPrice() + "центов");
        System.out.println("Цeны на все сорта яблок");
        for (Apple1 a : Apple1.values()) {
            System.out.println(a + "стоит" + a.getPrice() + "центов");
        }
    }
}
