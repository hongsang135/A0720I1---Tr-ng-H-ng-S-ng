package B2_vong_lap_trong_java.bai_tap.hien_thi_cac_so_nguyen_to_nho_hon_100;

public class DisplayPrimeLessThan100 {
    public static void main(String[] args) {
        int num=2;
        while (num<100){
            boolean check = true;
            int count = 2;
            while (count <= Math.sqrt(num)) {
                if (num % count == 0) {
                    check = false;
                    break;
                }
                count++;
            }
            if (check) {
                System.out.print(num + "\t");
            }
            num++;
        }
    }
}
