package b3_mang_va_phuong_thuc.bai_tap.mang_hai_chieu_tinh_tong_duong_cheo_chinh;

import java.util.Scanner;

public class SquareMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhập kích thước ma trận vuông: ");
        int row = scanner.nextInt();
        float[][] matrix;
        matrix = new float[row][row];
        for (int i =0; i<matrix.length;i++){
            System.out.println("Nhập hàng thứ " +(i+1));
            for (int j=0; j<matrix[i].length; j++){
                System.out.print("phần tử thứ " + (j+1) + ": ");
                matrix[i][j] = scanner.nextFloat();
            }
        }
        float sum=0;
        System.out.println("ma trận vừa nhập là: ");
        for (int i =0; i<matrix.length;i++){
            for (int j=0; j<matrix[i].length; j++){
                System.out.print(matrix[i][j] + "  ");
                if(i==j){
                    sum+=matrix[i][j];
                }
            }
            System.out.println();
        }
        System.out.println("tổng các phần tử trên đường chéo chính là: " + sum);
    }
}
