package b6_ke_thua.bai_tap.lop_point_va_moveablePoint;

public class Main {
    public static void main(String[] args) {
        Point point = new MovablePoint(9,9);
        MovablePoint movablePoint= new MovablePoint(5,8);
        movablePoint = (MovablePoint) point;
        System.out.println(movablePoint.toString());
    }
}
