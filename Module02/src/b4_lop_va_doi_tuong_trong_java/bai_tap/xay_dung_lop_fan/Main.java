package b4_lop_va_doi_tuong_trong_java.bai_tap.xay_dung_lop_fan;

public class Main {
    public static void main(String[] args) {
        Fan fan_1 = new Fan();
        fan_1.setOn(true);
        fan_1.setSpeed("fast");
        fan_1.setRadius(10);
        fan_1.setColor("yellow");
        Fan fan_2 = new Fan();
        fan_2.setOn(false);
        fan_2.setSpeed("medium");
        System.out.println("fan_1:"+ fan_1.getInfoFan());
        System.out.println("fan_2:"+ fan_2.getInfoFan());
    }
}
