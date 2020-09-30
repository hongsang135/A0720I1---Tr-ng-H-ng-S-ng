package b4_lop_va_doi_tuong_trong_java.bai_tap.xay_dung_lop_quadratic_equation;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter value of a: ");
        double a = scanner.nextDouble();
        System.out.print("enter value of b: ");
        double b = scanner.nextDouble();
        System.out.print("enter value of c: ");
        double c = scanner.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);
        if(quadraticEquation.getDiscriminant()>0){
            System.out.println("The equation has two roots " + quadraticEquation.getRoot1() + " and " + quadraticEquation.getRoot2());
        }else if(quadraticEquation.getDiscriminant() == 0){
            System.out.println("The equation has one roots " + quadraticEquation.getRoot1());
        }else{
            System.out.println("The equation has no roots ");
        }
    }
}
