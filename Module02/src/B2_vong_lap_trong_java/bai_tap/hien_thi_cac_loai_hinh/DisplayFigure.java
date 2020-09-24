package B2_vong_lap_trong_java.bai_tap.hien_thi_cac_loai_hinh;
import java.util.Scanner;
public class DisplayFigure {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please choose\n1.Print the rectangle\n2.Print the square triangle (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right)\n" +
                "3.Print isosceles triangle\n4.Exit\nEnter your choice:");
        int option = scanner.nextInt();
        switch (option){
            case 1:{
                System.out.println("nhập số hàng: ");
                int row = scanner.nextInt();
                System.out.println("nhập số cột: ");
                int col = scanner.nextInt();
                for(int i=1; i<= row; i++){
                    for (int j=1; j<=col; j++){
                        System.out.print("* ");
                    }
                    System.out.println("");
                }
                break;
            }
            case 2:{
                System.out.println("nhập chiều cao: ");
                int height = scanner.nextInt();
                for(int i=1; i<= height; i++){
                    for (int j=1; j<=i; j++){
                        System.out.print("* ");
                    }
                    System.out.println("");
                }
                System.out.println("");
                for(int i=height; i>= 1; i--){
                    for (int j=1; j<=i; j++){
                        System.out.print("* ");
                    }
                    System.out.println("");
                }
                System.out.println("");
                for(int i=1; i<=height; i++){
                    for (int j=1; j<=height; j++){
                        if(j<i){
                            System.out.print("  ");
                        }else{
                            System.out.print("* ");
                        }
                    }
                    System.out.println("");
                }
                System.out.println("");
                for(int i=height; i>=1; i--){
                    for (int j=1; j<=height; j++){
                        if(j<i){
                            System.out.print("  ");
                        }else{
                            System.out.print("* ");
                        }
                    }
                    System.out.println("");
                }
                break;
            }
            case 3:{
                System.out.println("nhập chiều cao: ");
                int height = scanner.nextInt();
                for(int i =0; i<=height; i++){
                    for(int j=0; j<=height+i;j++){
                        if(j<height-i){
                            System.out.print(" ");
                        }else{
                            System.out.print("*");
                        }
                    }
                    System.out.println();
                }
                break;
            }
            case 4:{
                break;
            }
            default:{
                System.out.println("fail");
                break;
            }
        }
    }

}
