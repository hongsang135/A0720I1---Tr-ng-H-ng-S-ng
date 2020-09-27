package b3_mang_va_phuong_thuc.bai_tap.tinh_tong_cac_so_o_cot_xac_dinh;

import java.util.Scanner;

public class SumColMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhập số hàng của ma trận: ");
        int row = scanner.nextInt();
        System.out.print("nhập số cột của ma trận: ");
        int col = scanner.nextInt();
        float[][] matrix;
        matrix = new float[row][col];
        for (int i =0; i<matrix.length;i++){
            System.out.println("Nhập hàng thứ " +(i+1));
            for (int j=0; j<matrix[i].length; j++){
                System.out.print("phần tử thứ " + (j+1) + ": ");
                matrix[i][j] = scanner.nextFloat();
            }
        }
        System.out.println("ma trận vừa nhập là: ");
        for (int i =0; i<matrix.length;i++){
            for (int j=0; j<matrix[i].length; j++){
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.print("bạn muốn tính tổng cột thứ mấy(tính từ 1): ");
        int indexCol = scanner.nextInt();
        float sumCol=0;
        for (int i =0; i<matrix.length; i++){
            sumCol+=matrix[i][indexCol-1];
        }
        System.out.println("tổng các phần tử tại cột thứ " + indexCol + " là: " + sumCol);
    }
}
