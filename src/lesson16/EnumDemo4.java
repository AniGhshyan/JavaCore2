package lesson16;

public class EnumDemo4 {
    public static void main(String[] args) {
        Apple1 ap1, ap2, ap3;
        System.out.println("Bce константы сортов яблок" + "и их порядковые значения:");
        for (Apple1 a : Apple1.values()) {
            System.out.println(a + " " + a.ordinal());
        }
        ap1 = Apple1.RedDel;
        ap2 = Apple1.GoldenDel;
        ap3 = Apple1.RedDel;
        System.out.println();
        if (ap1.compareTo(ap2) < 0) {
            System.out.println(ap1 + " предшествует " + ap2);
        }
        if (ap1.compareTo(ap2) > 0) {
            System.out.println(ap2 + " предшествует " + ap1);
        }
        if (ap1.compareTo(ap3) == 0) {
            System.out.println(ap1 + " равно " + ap3);
        }
        System.out.println();
        if (ap1.equals(ap2)) {
            System.out.println("Oшибкa!!");
        }
        if (ap1.equals(ap3)) {
            System.out.println(ap1 + " равно " + ap3);
        }
        if (ap1==ap3) {
            System.out.println(ap1 + " == " + ap3);
        }


    }
}
