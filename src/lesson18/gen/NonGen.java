package lesson18.gen;

public class NonGen {
    Object ob;

    NonGen(Object o) {
        ob = o;
    }

    Object getOb() {
        return ob;
    }

    void showType() {
        System.out.println("Oбъeкт оЬ относится к типу " + ob.getClass().getName());

    }
}
