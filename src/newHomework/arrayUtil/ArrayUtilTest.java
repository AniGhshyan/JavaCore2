package newHomework.arrayUtil;

public class ArrayUtilTest {
    public static void main(String[] args) {
        int[] array = {2, 5, 8, 10, 32, 22, 11, 66, 12, 30};
        ArrayUtil arrayUtil = new ArrayUtil(array);
        arrayUtil.elements();
        System.out.println("max = " + arrayUtil.max());
        System.out.println("min = " + arrayUtil.min());
        arrayUtil.pairElements();
        arrayUtil.oddElements();
        System.out.println("n = " + arrayUtil.pairElementsQuantity());
        System.out.println("n = " + arrayUtil.oddElementsQuantity());
        System.out.println("sum = " + arrayUtil.sum());
        System.out.println(arrayUtil.average());
    }
}
