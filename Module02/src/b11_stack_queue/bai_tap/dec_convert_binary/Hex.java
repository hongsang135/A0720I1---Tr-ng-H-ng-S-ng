package b11_stack_queue.bai_tap.dec_convert_binary;

import java.util.Arrays;
import java.util.Stack;

public class Hex {
    private String value;

    public Hex(String value) {
        this.value = value;
    }

    public Hex() {
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Decimal toDecimal(){
        String[] hexNumbers = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F"};
        int result = 0;
        int power = 0;
        Stack<String> surPlus = new Stack<>();
        for (int i = 0; i < this.value.length(); i++) {
            surPlus.push(String.valueOf(this.value.charAt(i)));
        }
        while (!surPlus.isEmpty()) {
            result +=  Integer.valueOf(Arrays.asList(hexNumbers).indexOf(surPlus.pop())) * Math.pow(16, power);
            power++;
        }
        Decimal decimalResult = new Decimal(result);
        return decimalResult;
    }

    public Binary toBinary() {
        Decimal decimal = this.toDecimal();
        return decimal.toBinary();
    }
}
