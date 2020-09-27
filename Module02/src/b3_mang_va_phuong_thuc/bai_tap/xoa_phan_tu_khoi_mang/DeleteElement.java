package b3_mang_va_phuong_thuc.bai_tap.xoa_phan_tu_khoi_mang;
import java.util.Scanner;

public class DeleteElement {
    public static int findElement(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr;
        System.out.print("Nhập số phần tử bạn muốn nhập vào mảng: ");
        int size = scanner.nextInt();
        arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("nhập giá trị phần tử thứ " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }
        System.out.print("Mảng đã nhập là: ");
        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i] + "  ");
        }
        System.out.println();
        System.out.print("Nhập giá trị bạn muốn xóa:");
        int deleteElement = scanner.nextInt();
        if (findElement(arr, deleteElement) == -1) {
            System.out.print("phần tử cần xóa không có trong mảng đã nhập");
        } else {
            int index = findElement(arr, deleteElement);
            for (int i = index; i < arr.length - 1; i++) {
                arr[i] = arr[i + 1];
            }
            arr[arr.length - 1] = 0;
            System.out.print("Mảng sau khi xóa là: ");
            for (int i = 0; i < arr.length; i++) {

                System.out.print(arr[i] + "  ");
            }
        }

    }
}
