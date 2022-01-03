package lesson19;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class HTDemo2 {
    public static void main(String[] args) {
        Hashtable<String, Double> balance = new Hashtable<>();
        String str;
        double bal;
        balance.put("Джoн Доу", 3434.34);
        balance.put("Том Смит", 123.22);
        balance.put("Джейн Бейкер", 1378.00);
        balance.put("Toд Холл", 99.22);
        balance.put("Paльф Смит", -19.08);
        Set<String> set = balance.keySet();
        Iterator<String> itr = set.iterator();
        while (itr.hasNext()) {
            str = itr.next();
            System.out.println(str + ": " + balance.get(str));
        }
        System.out.println();
        bal = balance.get("Джoн Доу");
        balance.put("Джoн Доу", bal + 1000);
        System.out.println("Hoвый остаток на счете Джона Доу: " + balance.get("Джoн Доу"));
    }
}
