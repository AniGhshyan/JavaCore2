package lesson12.var;

public class VarArgs {
    static void varTest(int... v) {
        System.out.println(v.length);
        for (int x : v) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
}
