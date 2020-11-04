package b11_stack_queue.bai_tap.kiem_tra_chuoi_palindrome;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class CheckPalindrome {

    public static boolean checkPalindrome(String str){
        Stack stack = new Stack();
        Queue queue = new LinkedList<>();
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
            queue.offer(str.charAt(i));
        }

        while (!stack.isEmpty()){
            if(!stack.pop().equals(queue.remove())){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập chuỗi muốn kiểm tra: ");
        String str = scanner.nextLine();
        if(checkPalindrome(str)){
            System.out.println("chuỗi vừa nhập là palindrome");
        }else{
            System.out.println("chuỗi vừa nhập KHÔNG phải là palindrome");

        }
    }
}
