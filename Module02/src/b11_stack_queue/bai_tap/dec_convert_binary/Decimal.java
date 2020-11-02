package b11_stack_queue.bai_tap.dec_convert_binary;

import java.util.Stack;

public class Decimal {
    private int value;

    public Decimal(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Binary toBinary() {
        Stack tempStack = new Stack();
        int temp = this.value;
        while (temp >= 1) {
            tempStack.push(temp % 2);
            temp = temp / 2;
        }
        String result = "";
        while (!tempStack.isEmpty()) {
            result = result.concat(String.valueOf(tempStack.pop()));
        }
        Binary binaryResult = new Binary(result);
        return binaryResult;
    }

    public Hex toHex() {
        String[] hexArray = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F"};
        int decimalNumber = this.value;
        Stack<String> hexStack = new Stack<>();
        while (decimalNumber >= 1) {
            hexStack.push(hexArray[decimalNumber % 16]);
            decimalNumber /= 16;
        }
        String result = "";
        while (!hexStack.isEmpty()) {
            result = result.concat(String.valueOf(hexStack.pop()));
        }
        Hex hexResult = new Hex(result);
        return hexResult;
    }
}
