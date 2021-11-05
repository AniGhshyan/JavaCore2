package Homework.dynamicArray;

public class DynamicArray {
    //    սա մեր հիմնական մասիվն է ,որտեղ պահելու ենք ավելացվող էլեմենտները
    private int[] array = new int[10];
    //    սա մեր մսիվի մեջ ավելացված էլեմենտների քանակն է
    private int size = 0;

    //    ստուգել եթե մասիվի մեջ տեղ չկա-> կանչել extend()
    //    ավելացնեք
    public void add(int value) {
        if (size >= array.length) {
            extend();
            for (int i = 0; i < array.length; i++) {
                array[size] = value;
                System.out.print(array[i] + " ");
            }
            size++;

        } else {
            for (int i = 0; i < array.length; i++) {
                array[size] = value;
                System.out.print(array[i] + " ");
            }
            size++;
        }
        System.out.println();
    }

    //    1․ստեղծել հին մասիվից 10 էլեմենտ ավելի մեծ մասիվ
    //    2․ քցել հին մասիվի էլեմենտները նորի մեջ
    //    3․ հին մասիվի հղումը կապել նոր մասիվի հղման հետ
    private void extend() {
        int[] result = new int[array.length + 10];
        if (size < result.length) {
            for (int i = 0; i < array.length; i++) {
                result[i] = array[i];
            }
            array = result;
        }

    }

    //    եթե տրված ինդեքսը մեր ունեցած մասիվի ինդեքսի սահմաններում է ,վերադարձնել
   //    մասիվի index -երերդ էլեմենտը։Հակառակ դեպքում վերադարձնել -1։
    public int getByIndex(int index) {
        if (index < array.length) {
            return array[index];
        }
        return -1;
    }

    //    տպել մասիվի ավելացված էլեմենտները
    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i]+" ");

        }

    }

}
