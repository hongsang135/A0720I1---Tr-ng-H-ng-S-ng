package b11_stack_queue.bai_tap.dem_so_tu;

import b12_java_collection_framework.thuc_hanh.hashMap_hashSet.Student;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Count {
    public static void main(String[] args) {
        Map<String, Integer> myMap = new TreeMap<>();
        String str = "que huong huong que     nuoc    non dat nuoc";
        String[] arrays = str.split("\\s+");
        for (String elm:arrays){
            if (myMap.containsKey(elm)){
                myMap.put(elm, myMap.get(elm)+1);
            }else {
                myMap.put(elm, 1);
            }
        }
        for(Map.Entry<String, Integer> entry : myMap.entrySet()){
            System.out.println(entry.getKey() + " xuat hien " +entry.getValue() +" lan");
        }

    }
}
