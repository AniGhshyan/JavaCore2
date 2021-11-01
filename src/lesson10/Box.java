package lesson10;

public class Box {
    double width;
    double height;
    double depth;

//    Box() {
//        System.out.println("Box օբյեկտի կոնստրուկտոր");
//        width = 10;
//        height = 10;
//        depth = 10;
//
//    }
    Box(double w,double h, double d){
        width=w;
        height=h;
        depth=d;
    }
//    Box(double width, double height, double depth) {
//        this.width = width;
//        this.height = height;
//        this.depth = depth;
//    }

    double volume() {
        return width * height * depth;
    }


}
