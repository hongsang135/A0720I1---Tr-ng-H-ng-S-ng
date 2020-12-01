package common;

public class Regex {
    public static final String REGEX_MA_SO_SO = "^[S][T][K][-]\\d{4}$";
    //public static final String REGEX_MA_DATE = "^([1-3][]*(\\.[\\d]*)?)|(0\\.[\\d]+)$";

    public static boolean checkMaSoSo(String input) {
        return input.matches(REGEX_MA_SO_SO);
    }

    public static boolean checkSoTienGui(String input) {
        if(Integer.parseInt(input)<1000000){
            return false;
        }else {
            return true;
        }
    }
}
