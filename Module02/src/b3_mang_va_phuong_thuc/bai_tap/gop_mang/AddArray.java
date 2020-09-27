package b3_mang_va_phuong_thuc.bai_tap.gop_mang;
import java.util.Scanner;
public class AddArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr_1;
        System.out.print("Nhập số phần tử bạn muốn nhập vào mảng thứ nhất: ");
        int size_1 = scanner.nextInt();
        arr_1 = new int[size_1];
        for (int i = 0; i < arr_1.length; i++) {
            System.out.print("nhập giá trị phần tử thứ " + (i + 1) + ": ");
            arr_1[i] = scanner.nextInt();
        }
        int[] arr_2;
        System.out.print("Nhập số phần tử bạn muốn nhập vào mảng thứ 2: ");
        int size_2 = scanner.nextInt();
        arr_2 = new int[size_2];
        for (int i = 0; i < arr_2.length; i++) {
            System.out.print("nhập giá trị phần tử thứ " + (i + 1) + ": ");
            arr_2[i] = scanner.nextInt();
        }
        System.out.print("Mảng thứ nhất là: ");
        for (int i = 0; i < arr_1.length; i++) {

            System.out.print(arr_1[i] + "  ");
        }
        System.out.println();
        System.out.print("Mảng thứ hai là: ");
        for (int i = 0; i < arr_2.length; i++) {

            System.out.print(arr_2[i] + "  ");
        }
        int[] arrSum;
        arrSum = new int[size_1+size_2];
        for(int i=0; i<arrSum.length;i++){
            if(i<arr_1.length){
                arrSum[i] = arr_1[i];
            }else {
                arrSum[i] = arr_2[i-arr_1.length];
            }
        }
        System.out.println();
        System.out.print("Mảng sau khi gộp là: ");
        for (int i = 0; i < arrSum.length; i++) {

            System.out.print(arrSum[i] + "  ");
        }
    }
}
