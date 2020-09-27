package b3_mang_va_phuong_thuc.thuc_hanh.tim_min_mang_su_dung_phuong_thuc;
import java.util.Scanner;
public class FindMinArrUseMethod {
    public static int minValue(int[] array){
        int indexMin = 0;
        int min = array[0];
        for(int i =1; i<array.length;i++){
            if(array[i]< min){
                min = array[i];
                indexMin = i;
            }
        }
        return indexMin;
    }
    public static void main(String[] args) {
        int []arr = {4, 12, 7, 8, 1, 6, 9};
        int index = minValue(arr);
        System.out.println("The smallest element in the array is: " + arr[index]);
    }
}
