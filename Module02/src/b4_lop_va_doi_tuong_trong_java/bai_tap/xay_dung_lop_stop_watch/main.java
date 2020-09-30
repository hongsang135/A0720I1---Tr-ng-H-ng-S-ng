package b4_lop_va_doi_tuong_trong_java.bai_tap.xay_dung_lop_stop_watch;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        int[] array = new int[10000000];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100000) + 1;
        }
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        Arrays.sort(array);
        stopWatch.stop();
        System.out.println("Time sort: "+ stopWatch.getElapsedTime());
    }
}
