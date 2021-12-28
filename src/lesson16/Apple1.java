package lesson16;

public enum Apple1 {
    Jonathan(10), GoldenDel(9), RedDel(12), Winesap(15), Cortland(8);
    private int price;

    Apple1(int p) {
        price = p;
    }

    Apple1() {
        price = -1;
    }

    int getPrice() {
        return price;
    }
}
