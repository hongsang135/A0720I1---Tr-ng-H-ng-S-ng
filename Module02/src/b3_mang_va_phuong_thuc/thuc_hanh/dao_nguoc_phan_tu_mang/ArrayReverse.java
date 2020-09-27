package b3_mang_va_phuong_thuc.thuc_hanh.dao_nguoc_phan_tu_mang;
import java.util.Scanner;
public class ArrayReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        do {
            System.out.print("Enter a size:");
            size = scanner.nextInt();
            if (size > 20)
                System.out.println("Size does not exceed 20");
        } while (size > 20);
        int[] arrNum;
        arrNum = new int[size];
        int i = 0;
        while (i < arrNum.length) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arrNum[i] = scanner.nextInt();
            i++;
        }
        System.out.printf("%-20s%s", "Elements in array: ", "");
        for (int j = 0; j < arrNum.length; j++) {
            System.out.print(arrNum[j] + "\t");
        }
        for (int j = 0; j < arrNum.length / 2; j++) {
            int temp = arrNum[j];
            arrNum[j] = arrNum[size - 1 - j];
            arrNum[size - 1 - j] = temp;
        }
        System.out.printf("%-20s%s", "Reverse array: ", "");
        for (int j = 0; j < arrNum.length; j++) {
            System.out.print(arrNum[j] + "\t");
        }
    }
}
