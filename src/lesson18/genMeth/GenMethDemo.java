package lesson18.genMeth;

public class GenMethDemo {
    static <T extends Comparable<T>, V extends T>
    boolean isIn(T x, V[] y) {
        for (int i = 0; i < y.length; i++) {
            if (x.equals(y[i])) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Integer nums[] = {1, 2, 3, 4, 5,};
        if (isIn(2, nums)) {
            System.out.println("Чиcлo 2 содержится в массиве nums");
        }
        if (!isIn(7, nums)) {
            System.out.println("Чиcлo 7 отсутствует в массиве nums");
        }
        System.out.println();
        String strs[] = {"один", "два", "три", "четыре", "пять" };
        if (isIn("двa", strs)) {
            System.out.println("два содержится в массиве strs");
        }
        if (!isIn("ceмь", strs)) {
            System.out.println("ceмь отсутствует в массиве strs");
        }
//        if (isIn("двa", nums)) {
//            System.out.println("двa содержится в массиве strs ");
//        }
    }
}
