package b13_search_algorithm.bai_tap.tim_chuoi_tang_dan;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class SortString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter string: ");
        String str = scanner.next();
        LinkedList<Character> max = new LinkedList<>();
        for (int i = 0; i < str.length(); i++) {
            LinkedList<Character> list = new LinkedList<>();
            list.add(str.charAt(i));
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(j) > list.getLast()) {
                    list.add(str.charAt(j));
                }
            }
            if (list.size() > max.size()) {
                max.clear();
                max.addAll(list);
            }
            list.clear();
        }
        for (Character charact : max) {
            System.out.print(charact);
        }
    }
}
