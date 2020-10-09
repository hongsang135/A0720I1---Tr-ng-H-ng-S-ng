package b6_ke_thua.bai_tap.lop_circle_va_lop_cylinder;

public class Main {
    public static void main(String[] args) {
        Circle circle_1 = new Circle(1, "green");
        System.out.println(circle_1);
        Cylinder cylinder = new Cylinder(7,"green",7.2);
        cylinder.getCapacity();
        System.out.println(cylinder.toString());
    }
}
