package B2_vong_lap_trong_java.bai_tap.hien_thi_20_so_nguyen_to_dau_tien;
import B2_vong_lap_trong_java.thuc_hanh.kiem_tra_so_nguyen_to.CheckPrime;
import java.util.Scanner;
public class DisplayPrime {
      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        do{
            System.out.print("Nhập số lượng số nguyên tố bạn muốn in ra(>0):");
            number = scanner.nextInt();
        }while (number<=0);
        int count=0;
        int num = 2;
        while (count<number){
            boolean check = true;
            int count_1 = 2;
            while (count_1 <= Math.sqrt(num)) {
                if (num % count_1 == 0) {
                    check = false;
                    break;
                }
                count_1++;
            }
            if (check) {
                System.out.print(num + "\t");
                count++;
            }
            num++;
        }
    }
}
