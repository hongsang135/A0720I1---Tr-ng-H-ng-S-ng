package b14_thuat_toan_sap_xep.bai_tap.setting_insert_sort;

import java.util.Arrays;

public class InsertionSort {
    public static void insertionSort(int[] list){
        for (int i = 1; i < list.length ; i++) {
            int currentValue = list[i];
            int j = i-1;
            for (; j >= 0 && list[j] > currentValue; j--) {
                list[j+1] = list[j];
            }
            list[j+1] = currentValue;
        }
    }
    public static void main(String[] args) {
        int[] arr = {9,8,6,5,7,1,4};
        insertionSort(arr);
        System.out.println("mảng sau khi sắp xếp: " + Arrays.toString(arr));
    }
}
