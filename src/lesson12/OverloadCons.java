package lesson12;

public class OverloadCons {
    public static void main(String[] args) {
        Box mybox1 = new Box(10, 20, 15);
        Box mybox2 = new Box();
        Box mycube = new Box(7);
        Box myclone = new Box(mybox1);
        double vol;
        vol = mybox1.valume();
        System.out.println("mybox1 volume " + vol);
        vol = mybox2.valume();
        System.out.println("mybox2 volume " + vol);
        vol = mycube.valume();
        System.out.println("mycube volume " + vol);
        vol = myclone.valume();
        System.out.println("myclone volume " + vol);
    }
}
