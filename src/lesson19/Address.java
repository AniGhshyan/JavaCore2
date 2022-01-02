package lesson19;

public class Address {
    private String name;
    private String street;
    private String city;
    private String state;
    private String code;

    public Address(String name, String street, String city, String state, String code) {
        this.name = name;
        this.street = street;
        this.city = city;
        this.state = state;
        this.code = code;
    }


    public String toString() {
        return name + "\n" + street + "\n" + city + " " + state + " " + code;
    }
}
