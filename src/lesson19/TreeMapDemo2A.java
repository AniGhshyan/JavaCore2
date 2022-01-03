package lesson19;

import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo2A {
    public static void main(String[] args) {
        CompLastNames compLN = new CompLastNames();
        Comparator<String> compLastThenFirst = compLN.thenComparing(new CompThenByFirstName());
        TreeMap<String, Double> tm = new TreeMap<>(compLastThenFirst);
        tm.put("Джон Доу", +new Double(3434.34));
        tm.put("Toм Смит", +new Double(123.22));
        tm.put("Джейн Бейкер", +new Double(1378.00));
        tm.put("Toд Халл", +new Double(99.22));
        tm.put("Ральф Смит", +new Double(-19.08));
        Set<Map.Entry<String, Double>> set = tm.entrySet();
        for (Map.Entry<String, Double> me : set) {
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
        System.out.println();
        double balance = tm.get("Джон Доу");
        tm.put("Джон Доу", balance + 1000);
        System.out.println(tm.get("Hoвый остаток на счете Джона Доу: " + "Джон Доу"));
    }
}
