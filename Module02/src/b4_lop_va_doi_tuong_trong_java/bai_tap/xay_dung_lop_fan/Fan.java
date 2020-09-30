package b4_lop_va_doi_tuong_trong_java.bai_tap.xay_dung_lop_fan;

public class Fan {
    private final int SLOW = 1;
    private final int MEDIUM = 2;
    private final int FAST = 3;
    private int speed;
    private boolean on;
    private double radius;
    private String color;
    public Fan(){
        this.speed = SLOW;
        this.on = false;
        this.radius = 5;
        this.color = "blue";
    }
    public int getSpeed(){
        return this.speed;
    }
    public void setSpeed(String speed){
        if(speed == "medium"){
            this.speed = this.MEDIUM;
        }else if(speed == "slow"){
            this.speed = this.SLOW;
        }else if(speed == "fast"){
            this.speed = this.FAST;
        }
    }
    public boolean getOn(){
        return this.on;
    }
    public void setOn(boolean on){
        this.on = on;
    }
    public double getRadius(){
        return this.radius;
    }
    public void setRadius(double radius){
        this.speed = speed;
    }
    public String getColor(){
        return this.color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public String getInfoFan(){
        if(this.getOn()){
            return "Information:\nFan is On\nSpeed: "
                    + this.getSpeed() + "\n"
                    + "Color: " + this.getColor() + "\n"
                    + "Radius: " + this.getRadius() + "\n";
        }else{
            return "Information:\nFan is Off\n"
                    + "Color: " + this.getColor() + "\n"
                    + "Radius: " + this.getRadius() + "\n";
        }
    }

}
