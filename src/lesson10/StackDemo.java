package lesson10;

public class StackDemo {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.pop();
        System.out.println(stack.pop());
        System.out.println(stack.isEmpty());

    }

}
