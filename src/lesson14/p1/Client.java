package lesson14.p1;

public class Client implements Callback{
    public void callback(int p){
        System.out.println("Method callback ");
    }
    void nonIfaceMeth(){
        System.out.println("class implements Callback");
    }
}
