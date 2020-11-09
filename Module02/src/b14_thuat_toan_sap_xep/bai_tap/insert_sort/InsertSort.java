package b14_thuat_toan_sap_xep.bai_tap.insert_sort;

import java.util.Arrays;

public class InsertSort {
    public static void sort(int[] arr){
        for (int i = 1; i < arr.length ; i++) {
            int currentElement = arr[i];
            int j = i-1;
            for (; j >= 0 && arr[j] > currentElement ; j--) {
                arr[j+1] = arr[j];
            }
            arr[j+1] = currentElement;
            System.out.println("mảng sau lần lặp thứ " + i + ": " + Arrays.toString(arr));
        }
    }

    public static void main(String[] args) {
        int[] arr = {9,8,6,5,7,1,4};
        System.out.println("mảng đã nhập: " + Arrays.toString(arr));
        System.out.println("---------------------");
        sort(arr);
    }
}
