package lesson10;

public class StackDemo {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push('a');
        stack.push('b');
        stack.push('c');
        stack.pop();
        System.out.println(stack.pop());
        System.out.println(stack.isEmpty());

    }

}
