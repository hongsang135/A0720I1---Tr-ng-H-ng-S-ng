/*package b11_stack_queue.bai_tap.kiem_tra_dau_ngoac;

import java.util.Stack;

public class CheckBracket {
    public static boolean checkBracket(String str){
        Stack bStack = new Stack();
        for (int i = 0; i < str.length(); i++) {
            if(String.valueOf(str.charAt(i)).equals("(")){
                bStack.push(String.valueOf(str.charAt(i)));
            }else if(String.valueOf(str.charAt(i)).equals(")")){
                if(bStack.isEmpty()){
                    return false;
                }
            }
        }
    }
}*/
