package b1_introduction_to_java.bai_tap.chuyen_doi_tien_te;
import java.util.Scanner;
public class ConvertUsdToVnd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        short rate = 23000;
        System.out.print("Nhập số tiền USD: ");
        int usd = scanner.nextInt();
        int vnd = usd * rate;
        System.out.println("Số tiền VND là: " + vnd);
    }
}
