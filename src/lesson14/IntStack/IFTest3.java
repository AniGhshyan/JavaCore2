package lesson14.IntStack;

public class IFTest3 {
    public static void main(String[] args) {
        IntStack mystack;
        DynStack ds = new DynStack(5);
        FixeedStack fs = new FixeedStack(8);
        mystack = ds;
        for (int i = 0; i < 12; i++) {
            mystack.push(i);
        }
        for (int i = 0; i < 12; i++) {
            System.out.print(mystack.pop() + " ");
        }
        System.out.println();
        mystack = fs;
        for (int i = 0; i < 8; i++) {
            mystack.push(i);
        }
        for (int i = 0; i < 8; i++) {
            System.out.print(mystack.pop() + " ");
        }

    }
}
