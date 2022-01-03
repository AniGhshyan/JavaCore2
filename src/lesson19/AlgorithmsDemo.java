package lesson19;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class AlgorithmsDemo {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(-8);
        ll.add(20);
        ll.add(-20);
        ll.add(8);
        Comparator<Integer> r = Collections.reverseOrder();
        Collections.sort(ll, r);
        System.out.println("Cпиcoк отсортирован в обратном порядке: ");

        for (int i : ll) {
            System.out.print(i + " ");
        }
        System.out.println();
        Collections.shuffle(ll);

        System.out.println("Cпиcoк перетасован: ");
        for (int i : ll) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Mинимyм: " + Collections.min(ll));
        System.out.println("Максимум: " + Collections.max(ll));
    }
}
