package lesson19;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        System.out.println("Haчaльный размер списочного массива al: " + al.size());
        al.add("C");
        al.add("A");
        al.add("E");
        al.add("D");
        al.add("F");
        al.add(1, "A2");
        System.out.println("Paзмep списочного массива al после ввода элементов: " + al.size());
        System.out.println("Coдepжимoe списочного массива al: " + al);
        al.remove("F");
        al.remove(2);
        System.out.println("Paзмep списочного массива al после удаления элементов: " + al.size());
        System.out.println("Coдepжимoe списочного массива al: " + al);
    }
}
