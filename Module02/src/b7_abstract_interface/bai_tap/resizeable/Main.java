package b7_abstract_interface.bai_tap.resizeable;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(4,"red",true);
        shapes[1] = new Rectangle(5,8,"blue",false);
        shapes[2] = new Square(5,"yellow", true);
        for (Shape shape: shapes) {
            System.out.println(shape.toString());
        }
        System.out.println("----------------------------");
        for (Shape shape: shapes) {
            System.out.println("dien tich la:"+ shape.getArea());
            shape.resize(5);
            //System.out.println(shape.toString());
            System.out.println("dien tich la:"+ shape.getArea());
        }
    }
}
