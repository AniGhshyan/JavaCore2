package lesson14.IntStack;

public class FixeedStack implements IntStack {
    private int stck[];
    private int tos;

    FixeedStack(int size) {
        stck = new int[size];
        tos--;
    }

    @Override
    public void push(int item) {
        if (tos == stck.length - 1) {
            System.out.println("Stack is full");
        } else {
            stck[++tos] = item;
        }
    }

    @Override
    public int pop() {
        if (tos < 0) {
            System.out.println("Stack is empty");
            return 0;
        } else {
            return stck[tos--];
        }

    }
}