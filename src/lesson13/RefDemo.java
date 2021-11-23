package lesson13;

public class RefDemo {
    public static void main(String[] args) {
        BoxWeight boxWeight=new BoxWeight(3,5,7,8.37);
        Box plainbox=new Box();
        double vol;
        vol= boxWeight.valume();
        System.out.println("boxWeight volume = "+vol);
        System.out.println("boxWeight weight = "+boxWeight.weight);
        plainbox=boxWeight;
        vol=plainbox.valume();
        System.out.println("plainbox volume = "+vol);
//        System.out.println("plainbox weight = "+plainbox.weight);
    }
}
