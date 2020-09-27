package b3_mang_va_phuong_thuc.bai_tap.them_phan_tu_vao_mang;

import java.util.Scanner;

public class AddElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {1, 3, 6, 4, 2, 0, 0, 0, 0, 0};
        System.out.print("Mảng ban đầu là: ");
        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i] + "  ");
        }
        System.out.println();
        System.out.print("Nhập giá trị bạn muốn thêm:");
        int elementAdd = scanner.nextInt();
        System.out.print("Nhập vị trí bạn muốn thêm:");
        int index = scanner.nextInt();
        if(index<1||index>arr.length){
            System.out.println("không thể chèn phần tử vào mảng");
        }else{
            int temp = arr[index-1];
            arr[index-1]= elementAdd;
            for (int i =index; i < arr.length-1;i++){
                int temp_1 = arr[i];
                arr[i]= temp;
                temp = temp_1;
            }
            System.out.print("Mảng sau khi chèn là: ");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + "  ");
            }
        }
    }
}
