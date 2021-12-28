package lesson16;

public class AutoBox3 {
    public static void main(String[] args) {
        Integer iOb1, iOb2;
        int i;
        iOb1 = 100;
        System.out.println("iOb1 = " + iOb1);
        ++iOb1;
        System.out.println("++iOb1 = " + iOb1);
        iOb2 = iOb1 + (iOb1 / 3);
        System.out.println("iOb2 = " + iOb2);
        i = iOb1 + (iOb1 / 3);
        System.out.println("i = " + i);
    }
}
