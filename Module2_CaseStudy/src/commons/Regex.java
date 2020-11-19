package commons;

import java.util.Scanner;

public class Regex {
    public static final String REGEX_VILLA_ID = "^[S][V][V][L][-]\\d{4}$";
    public static final String REGEX_HOUSE_ID = "^[S][V][H][O][-]\\d{4}$";
    public static final String REGEX_ROOM_ID = "^[S][V][R][O][-]\\d{4}$";
    public static final String REGEX_NAME_SERVICE = "^[A-Z][a-z]+(\\s[A-Z][a-z]+)*$";
    public static final String REGEX_SERVICE_FREE = "(massage)|(karaoke)|(food)|(drink)|(car)";
    static Scanner scanner;

    public static boolean checkIDVilla(String input) {
        return input.matches(REGEX_VILLA_ID);
    }

    public static boolean checkIDHouse(String input) {
        return input.matches(REGEX_HOUSE_ID);
    }

    public static boolean checkIDRoom(String input) {
        return input.matches(REGEX_ROOM_ID);
    }

    public static boolean checkNameAndRentType(String input) {
        return input.matches(REGEX_NAME_SERVICE);
    }

    public static boolean checkArea(String input) {
        double areaCheck;
        try {
            areaCheck = Double.parseDouble(input);
            return areaCheck > 30;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean checkRate(String input) {
        double rateCheck;
        try {
            rateCheck = Double.parseDouble(input);
            return rateCheck > 0;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean checkMaxCapacity(String input) {
        double capacityCheck;
        try {
            capacityCheck = Double.parseDouble(input);
            return capacityCheck > 0 && capacityCheck < 20;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean checkServiceFree(String input) {
        return input.matches(REGEX_SERVICE_FREE);
    }

    public static boolean checkFloor(String input){
        int floorCheck;
        try{
            floorCheck = Integer.parseInt(input);
            return floorCheck > 0;
        }catch (Exception e){
            return false;
        }
    }

}
