package b5_access_modifier_static.bai_tap.access_modifier;

public class Circle {
    private double radius;
    private String color;
    public Circle(){
        this.radius = 1.0;
        this.color = "red";
    }
    public Circle(double radius){
        this.radius = radius;
        this.color = "Red";
    }

    protected double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    protected double getArea(){
        return (Math.PI*Math.pow(this.getRadius(),2));
    }
}
