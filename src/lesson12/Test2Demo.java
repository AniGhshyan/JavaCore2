package lesson12;

public class Test2Demo {
    public static void main(String[] args) {
        Test2 ob=new Test2(15,20);
        System.out.println("a և  b նախքան կանչը " + ob.a + " " + ob.b);
        ob.meth(ob);
        System.out.println("a և  b կանչից հետո " + ob.a + " " + ob.b);

    }
}
