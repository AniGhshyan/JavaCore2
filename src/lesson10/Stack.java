package lesson10;

public class Stack {
    public int array[] = new int[10];
    public int index;

//    public Stack(int lenght) {
//        char array[] = new char[lenght];
//        index = -1;
//    }

    public Stack() {
        index = -1;
    }

    public void push(int item) {
        if (index == 9) {
            System.out.println("Stack is full");

        } else {
            array[++index] = item;
        }

    }

    public int pop() {
        if (index < 0) {
//            System.out.println("Stack is enpty");
            return 0;
        } else {
            return array[index--];
        }

    }

    public boolean isEmpty() {
        return index == -1;
    }

}
