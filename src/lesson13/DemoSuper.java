package lesson13;

public class DemoSuper {
    public static void main(String[] args) {
        BoxWeight mybox1 = new BoxWeight(10, 20, 15, 34.3);
        BoxWeight mybox2 = new BoxWeight(2, 3, 4, 0.076);
        BoxWeight mybox3 = new BoxWeight();
        BoxWeight mycube = new BoxWeight(3, 2);
        BoxWeight myclone = new BoxWeight(mybox1);
        double vol;
        vol = mybox1.valume();
        System.out.println("mybox1 volume = " + vol);
        System.out.println("mybox1 weight = " + mybox1.weight);
        System.out.println();
        vol = mybox2.valume();
        System.out.println("mybox2 volume = " + vol);
        System.out.println("mybox2 weight = " + mybox2.weight);
        System.out.println();
        vol = mybox3.valume();
        System.out.println("mybox3 volume = " + vol);
        System.out.println("mybox3 weight = " + mybox3.weight);
        System.out.println();
        vol = myclone.valume();
        System.out.println("myclone volume = " + vol);
        System.out.println("myclone weight = " + myclone.weight);
        System.out.println();
        vol = mycube.valume();
        System.out.println("mycube volume = " + vol);
        System.out.println("mycube weight = " + mycube.weight);
    }
}
