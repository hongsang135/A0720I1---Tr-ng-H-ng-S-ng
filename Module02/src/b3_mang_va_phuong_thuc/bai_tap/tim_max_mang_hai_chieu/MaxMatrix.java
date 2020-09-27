package b3_mang_va_phuong_thuc.bai_tap.tim_max_mang_hai_chieu;
import java.util.Scanner;
public class MaxMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhập số hàng của ma trận: ");
        int row = scanner.nextInt();
        System.out.print("nhập số cột của ma trận: ");
        int col = scanner.nextInt();
        int[][] matrix;
        matrix = new int[row][col];
        for (int i =0; i<matrix.length;i++){
            System.out.println("Nhập hàng thứ " +(i+1));
            for (int j=0; j<matrix[i].length; j++){
                System.out.print("phần tử thứ " + (j+1) + ": ");
                matrix[i][j] = scanner.nextInt();
            }
        }
        int max = matrix[0][0];
        int indexRow = 0;
        int indexCol = 0;
        System.out.println("ma trận vừa nhập là: ");
        for (int i =0; i<matrix.length;i++){
            for (int j=0; j<matrix[i].length; j++){
                System.out.print(matrix[i][j] + "  ");
                if(matrix[i][j]>max){
                    max = matrix[i][j];
                    indexRow = i;
                    indexCol = j;
                }
            }
            System.out.println();
        }
        System.out.println("giá trị lớn nhất trong ma trận là: " + max + " nằm tại vị trí hàng " + (indexRow+1) + " cột " + (indexCol+1) );
    }
}
