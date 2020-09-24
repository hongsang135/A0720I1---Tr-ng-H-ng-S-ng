package B1_introduction_to_java.bai_tap.doc_so_thanh_chu;
import java.util.Scanner;

public class NumberToWord {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] ones = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "night"};
        String[] tens_1 = {"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
        String[] tens_2 = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
        String[] tens_pow = {"hundred"};
        System.out.print("Enter number: ");
        int number = scanner.nextInt();
        while (number < 0) {
            System.out.print("Enter positive numbers: ");
            number = scanner.nextInt();
        }
        if (number <10){
            System.out.print(ones[number]);
        }else if(number>9 && number<20){
            System.out.print(tens_1[number%10]);
        }else if(number>19 && number<100){
            if(number%10==0){
                System.out.println(tens_2[number/10]);
            }else{
                System.out.println(tens_2[number/10] + " " + ones[number%10]);
            }
        }else if(number>99 && number<1000){
            String result = ones[number/100] + " " + tens_pow[0];
            if (number%100 <10){
                if(number%100==0){

                }else{
                result += " " +ones[number%100];
                }

            }else if(number%100>9 && number%100<20){
               result += " " + tens_1[number%100%10];
            }else if(number%100>19){
                if(number%10==0){
                    result += " " +tens_2[(number%100)/10];
                }else{
                    result += " " +tens_2[(number%100)/10] + " " + ones[(number%100)%10];
                }
            }
            System.out.println(result);
        }else{
            System.out.println("No support");
        }
    }
}
