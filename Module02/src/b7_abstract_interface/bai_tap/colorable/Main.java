package b7_abstract_interface.bai_tap.colorable;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(8, "red", true);
        shapes[1] = new Rectangle(8, 10, "red", true);
        shapes[2] = new Square(9, "red", true);
        for (Shape shape : shapes) {
            System.out.println(shape.toString());
            System.out.println(shape.getArea());
            if (shape instanceof Square) {
                Square square = (Square) shape;
                square.howToColor();
            }
        }
    }
}
