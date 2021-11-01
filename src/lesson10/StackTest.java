package lesson10;

public class StackTest {
    public static void main(String[] args) {
        Stack myStack1 = new Stack();
        Stack myStack2 = new Stack();
        for (int i = 0; i < 10; i++) {
            myStack1.push(i);
        }
        for (int i = 10; i < 20; i++) {
            myStack2.push(i);
        }
        System.out.println("myStack1 պարունակությունը ");
        for (int i = 0; i < 10; i++) {
            System.out.print(myStack1.pop() + " ");
        }
        System.out.println();
        System.out.println("myStack2 պարունակությունը ");
        for (int j = 0; j < 10; j++) {
            System.out.print(myStack2.pop() + " ");

        }
    }
}
