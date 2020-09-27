package b3_mang_va_phuong_thuc.bai_tap.dem_so_lan_xuat_hien_cua_ky_tu;
import java.util.Scanner;
public class CountChaInString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập chuỗi của bạn: ");
        String string = scanner.nextLine();
        System.out.println("Nhập ký tự muốn đếm: ");
        char charact = scanner.next().charAt(0);
        int count =0;
        for (int i=0; i<string.length(); i++){
            if(string.charAt(i)==charact){
               count++;
            }
        }
        System.out.println("ký tự " + charact + " xuất hiện " + count + " lần trong chuỗi.");
    }
}
