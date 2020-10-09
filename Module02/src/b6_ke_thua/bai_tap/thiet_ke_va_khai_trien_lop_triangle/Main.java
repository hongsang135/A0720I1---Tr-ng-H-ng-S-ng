package b6_ke_thua.bai_tap.thiet_ke_va_khai_trien_lop_triangle;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Triangle triangle = new Triangle();
        System.out.print("Nhập độ dài cạnh thứ nhất: ");
        triangle.setSide1(scanner.nextDouble());
        System.out.print("Nhập độ dài cạnh thứ hai: ");
        triangle.setSide2(scanner.nextDouble());
        System.out.print("Nhập độ dài cạnh thứ ba: ");
        triangle.setSide3(scanner.nextDouble());
        System.out.print("nhập màu sắc: ");
        triangle.setColor(scanner.next());
        System.out.println(triangle.toString());
    }
}
