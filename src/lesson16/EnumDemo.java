package lesson16;

public class EnumDemo {
    public static void main(String[] args) {
        Apple ap;
        ap = Apple.RedDel;
        System.out.println("Знaчeниe ар: " + ap);
        ap = Apple.GoldenDel;
        if (ap == Apple.GoldenDel) {
            System.out.println("Переменная ар содержит GoldenDel.");
        }
        switch (ap) {
            case Jonathan:
                System.out.println("Copт Jonathan красный.");
                break;
            case GoldenDel:
                System.out.println("Сорт Golden Delicious желтый.");
                break;
            case RedDel:
                System.out.println("Copт Red Delicious красный.");
                break;
            case Winesap:
                System.out.println("Copт Winesap красный.");
                break;
            case Cortland:
                System.out.println("Copт Cortland красный.");
                break;
        }
    }
}
