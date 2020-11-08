package b13_search_algorithm.bai_tap.tim_kiem_nhi_phan_de_quy;

public class SearchBinaryRecursive {
    public static int searchBinary(int head, int tail, int value,int arr[] ){
        int mid = (head+tail)/2;
        if(tail>head) {
            if (value == arr[mid]) {
                return mid;
            } else if (value > arr[mid]) {
                return searchBinary(mid + 1, tail, value, arr);
            } else if(value < arr[mid]) {
                return searchBinary(head, mid - 1, value, arr);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,6,7,5,9,14,58,61,68,92};
        System.out.println(searchBinary(0,arr.length-1, 61, arr));
    }
}
