package b6_ke_thua.bai_tap.lop_circle_va_lop_cylinder;

public class Cylinder extends Circle {
    private double height;

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }
    public Cylinder() {
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getCapacity(){
        return Math.PI * (getRadius() * getRadius()) * getHeight();
    }
    public String toString(){
        return "Cylinder: Radius is: " + getRadius() + ". Color is: " + getColor() + " Height: " + getHeight() + " Capacity: " + getCapacity();
    }

}
