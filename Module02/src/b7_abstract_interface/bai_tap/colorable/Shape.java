package b7_abstract_interface.bai_tap.colorable;

import b7_abstract_interface.bai_tap.resizeable.Resizeable;

public abstract class Shape implements Colorable{
    private String color;
    private boolean filled;
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public boolean isFilled() {
        return filled;
    }
    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    public abstract double getArea();
    @Override
    public String toString() {
        return "A Shape with color of "
                + getColor()
                + " and "
                + (isFilled() ? "filled" : "not filled");
    }

    @Override
    public void howToColor() {
    }
}
