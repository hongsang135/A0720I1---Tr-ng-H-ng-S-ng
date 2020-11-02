package b11_stack_queue.bai_tap.dec_convert_binary;

import java.util.Stack;

public class Binary {
    private String value;

    public Binary(String value) {
        this.value = value;
    }

    public Binary() {
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Decimal toDecimal(){
        int decResult = 0;
        int power = 0;
        Stack<String> surPlus = new Stack<>();
        for (int i = 0; i < this.value.length(); i++) {
            surPlus.push(String.valueOf(this.value.charAt(i)));
        }
        while (!surPlus.isEmpty()) {
            decResult += Integer.valueOf(surPlus.pop()) * Math.pow(2, power);
            power++;
        }
        Decimal decimal = new Decimal(decResult);
        return decimal;
    }

    public Hex toHex(){
        Decimal decimalNumber = this.toDecimal();
        return decimalNumber.toHex();
    }
}
