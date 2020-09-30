package b4_lop_va_doi_tuong_trong_java.bai_tap.xay_dung_lop_stop_watch;

import java.util.Date;

public class StopWatch {
    private long startTime = 0;
    private long stopTime = 0;

    public void start() {
        this.startTime = System.currentTimeMillis();
    }
    public void stop() {
        this.stopTime = System.currentTimeMillis();
    }
    public long getElapsedTime() {
        return stopTime - startTime;
    }
}
