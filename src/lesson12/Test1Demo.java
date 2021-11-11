package lesson12;

public class Test1Demo {
    public static void main(String[] args) {
        Test1 ob = new Test1();
        int a = 15, b = 20;
        System.out.println("a և  b նախքան կանչը " + a + " " + b);
        ob.meth(a, b);
        System.out.println("a և  b կանչից հետո " + a + " " + b);
    }
}
