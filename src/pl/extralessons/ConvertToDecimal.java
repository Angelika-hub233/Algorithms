package pl.extralessons;

public class ConvertToDecimal {
    public static void main(String[] args) {

        int binaryNumber = 101011110;
        System.out.println(convertToDecimal(binaryNumber));
    }

    public static int convertToDecimal (int binary) {
        int decimalNumber = 0;
        int base = 1;

        int last_digit;
        int temp = binary;
        while (temp >0) {
            last_digit = temp % 10;
            temp = temp/10;
            decimalNumber += last_digit * base;
            base *= 2;
        }
        return decimalNumber;
    }
}
