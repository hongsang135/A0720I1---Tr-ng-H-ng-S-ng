package b6_ke_thua.bai_tap.lop_point2D_va_lop_Point3D;

public class Point2D {
    private float x;
    private float y;

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Point2D(){
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y){
        this.x = x;
        this.y = y;
    }

    public float[] getXY(){
        float[] arrayXY = {getX(),getY()};
        return arrayXY;
    }
    @Override
    public String toString() {
        return "Location: ("+getX()+","+getY()+").";
    }
}
