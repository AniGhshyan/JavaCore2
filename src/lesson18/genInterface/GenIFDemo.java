package lesson18.genInterface;

public class GenIFDemo {
    public static void main(String[] args) {
        Integer inums[] = {3, 6, 2, 8, 6};
        Character chs[] = {'b', 'r', 'p', 'w'};
        MyClass<Integer> iob = new MyClass<>(inums);
        MyClass<Character> cob = new MyClass<>(chs);
        System.out.println("Maкcимaльнoe значение в массиве inums: " + iob.max());
        System.out.println("Mинимaльнoe значение в массиве inums: " + iob.min());
        System.out.println("Maкcимaльнoe значение в массиве chs: " + cob.max());
        System.out.println("Mинимaльнoe значение в массиве chs: " + cob.min());
    }
}
