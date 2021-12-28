package lesson16.market;

import java.lang.reflect.Method;

public class Market {
    @MyMarket
    public static void myMeth() {
        Market ob = new Market();
        try {
            Method m = ob.getClass().getMethod("myMeth");
            if (m.isAnnotationPresent(MyMarket.class)) {
                System.out.println("Маркерная аннотация MyMarker присутствует.");
            }
        } catch (NoSuchMethodException exs) {
            System.out.println("Meтoд не найден.");
        }
    }

    public static void main(String[] args) {
        myMeth();
    }
}
