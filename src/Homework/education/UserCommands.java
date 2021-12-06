package Homework.education;

public interface UserCommands {
    String LOGIN = "1";
    String REGISTER = "2";
    String EXIT = "0";

    static void printCommans1() {
        System.out.println("\u001B[34m" + "Please input " + EXIT + " for exist");
        System.out.println("Please input " + LOGIN + " for user's login");
        System.out.println("Please input " + REGISTER + " for register");
    }

}
