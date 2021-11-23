package lesson13;

public class DemoBoxWeight {
    public static void main(String[] args) {
        BoxWeight mybox1 = new BoxWeight(10, 20, 15, 34.3);
        BoxWeight mybox2 = new BoxWeight(2, 3, 4, 0.076);
        double vol;
        vol = mybox1.valume();
        System.out.println("mybox1 volume = " + vol);
        System.out.println("mybox1 weight = " + mybox1.weight);
        vol=mybox2.valume();
        System.out.println("mybox2 volume = " + vol);
        System.out.println("mybox2 weight = " + mybox2.weight);
    }
}
