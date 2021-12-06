package lesson14.IntStack;

public class IFTest {
    public static void main(String[] args) {
        FixeedStack mystack1 = new FixeedStack(5);
        FixeedStack mystack2 = new FixeedStack(8);
        for (int i = 0; i < 5; i++) {
            mystack1.push(i);
        }
        for (int i = 0; i < 5; i++) {
            System.out.print(mystack1.pop() + " ");
        }
        System.out.println();
        for (int i = 0; i < 8; i++) {
            mystack2.push(i);
        }
        for (int i = 0; i < 8; i++) {
            System.out.print(mystack2.pop() + " ");
        }

    }
}
