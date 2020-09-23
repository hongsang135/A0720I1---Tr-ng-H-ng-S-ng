package B2_vong_lap_trong_java.thuc_hanh.kiem_tra_so_nguyen_to;
import java.util.Scanner;
public class CheckPrime {
    public static void main(String[] args) {
        System.out.println("enter number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        boolean check = true;
        if (number < 2) {
            System.out.println(number + " is not Prime");
        } else {
            int count = 2;
            while (count <= Math.sqrt(number)) {
                if (number % count == 0) {
                    check = false;
                    break;
                }
                count++;
            }
            if (check) {
                System.out.println(number + " is Prime");
            } else {
                System.out.println(number + " is not Prime");
            }
        }
    }
}
