package b11_stack_queue.bai_tap.dao_nguoc_mang;

import java.util.ArrayList;
import java.util.Stack;

public class Reverse {
    public static void main(String[] args) {
        int[] numArr = {1,3,5,7,6};
        Stack myStack = new Stack();
        for (int i = 0; i < numArr.length; i++) {
            myStack.push(numArr[i]);
        }
        for (int i = 0; i < numArr.length ; i++) {
            numArr[i] = (int) myStack.pop();
        }
        for (int i = 0; i < numArr.length ; i++) {
            System.out.print(numArr[i]);
        }

        Stack wStack = new Stack();
        String wWord = "truong hong sang";

        for (int i = 0; i < wWord.length(); i++) {
            wStack.push(wWord.charAt(i));
        }
        String strReverse = "";
        while(!wStack.isEmpty()){
            strReverse += wStack.pop();
        }
        System.out.println();
        System.out.print(strReverse);
    }
}
