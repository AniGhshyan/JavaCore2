package lesson18.instansOf;

public class HierDemo3 {
    public static void main(String[] args) {
        Gen<Integer> iOb = new Gen<>(88);
        Gen2<Integer> iOb2 = new Gen2<>(99);
        Gen2<String> strOb2 = new Gen2<>("Tecт обобщений");
        if (iOb2 instanceof Gen2<?>) {
            System.out.println("Oбъeкт iOb2 является " + "экземпляром класса Gen2");
        }
        if (iOb2 instanceof Gen<?>) {
            System.out.println("Oбъeкт iOb2 является " + "экземпляром класса Gen");
        }
        System.out.println();
        if (strOb2 instanceof Gen2<?>) {
            System.out.println("Oбъeкт strOb2 является " + "экземпляром класса Gen2");
        }
        if (strOb2 instanceof Gen<?>) {
            System.out.println("Oбъeкт strOb2 является " + "экземпляром класса Gen2");
        }
        System.out.println();
        if (iOb instanceof Gen2<?>) {
            System.out.println("Oбъeкт iOb является" + "экземпляром класса Gen2");
        }
        if (iOb instanceof Gen<?>) {
            System.out.println("Oбъeкт iOb является " + " экземпляром класса Gen");
        }
    }
}
