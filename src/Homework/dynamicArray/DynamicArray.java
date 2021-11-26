package Homework.dynamicArray;

public class DynamicArray {
    //    սա մեր հիմնական մասիվն է ,որտեղ պահելու ենք ավելացվող էլեմենտները
    private int[] array;
    //    սա մեր մսիվի մեջ ավելացված էլեմենտների քանակն է
    private int size = 0;

    DynamicArray() {
        array = new int[10];
    }

    DynamicArray(int lenght) {
        array = new int[lenght];
    }

    //    ստուգել եթե մասիվի մեջ տեղ չկա-> կանչել extend()
    //    ավելացնեք
    public void add(int value) {
        if (size == array.length) {
            extend();
        }
        array[size++] = value;
    }

    public void add(int[] numbers) {
        for (int number : numbers) {
            add(number);

        }

    }

    public void set(int value, int index) {
        if (index < 0 || index > size) {
            System.out.println("invalid index " + index);
        } else {
            array[index] = value;
        }
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isExists(int value) {
        for (int i = 0; i < size; i++) {
            if (array[i] == value){
                return true;
            }
        }
        return false;

    }

    public void add(int value, int index) {
        if (index < 0 || index > size) {
            System.out.println("invalid index " + index);
        } else {
            if (size == array.length) {
                extend();
            }
            for (int i = size; i >= index; i--) {
                array[i] = array[i - 1];

            }
            array[index] = value;
            size++;

        }
    }
    //    1․ստեղծել հին մասիվից 10 էլեմենտ ավելի մեծ մասիվ
    //    2․ քցել հին մասիվի էլեմենտները նորի մեջ
    //    3․ հին մասիվի հղումը կապել նոր մասիվի հղման հետ
    private void extend() {
        int[] result = new int[array.length + 10];
        for (int i = 0; i < size; i++) {
            result[i] = array[i];
        }
        array = result;
    }

    //    եթե տրված ինդեքսը մեր ունեցած մասիվի ինդեքսի սահմաններում է ,վերադարձնել
    //    մասիվի index -երերդ էլեմենտը։Հակառակ դեպքում վերադարձնել -1։
    public int getByIndex(int index) {
        if (index < 0 || index > size) {
            System.err.println("invalid index" + index);
            return -1;
        }
        return array[index];
    }

    //    տպել մասիվի ավելացված էլեմենտները
    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public void delete(int index) {
        if (index < 0 || index > size) {
            System.out.println("invalid index " + index);
        } else {
            for (int i = index + 1; i < size; i++) {
                array[i - 1] = array[i];
            }
            size--;
        }

    }


}
