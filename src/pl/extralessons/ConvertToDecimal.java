package pl.extralessons;

public class ConvertToDecimal {
    public static void main(String[] args) {

        int binaryNumber = 101011110;
        System.out.println(convertBinaryToDecimal(binaryNumber));
        int octalNumber = 10;
        System.out.println(convertOctalToDecimal(octalNumber));
    }

    public static int convertBinaryToDecimal (int binary) {
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

    public static int convertOctalToDecimal (int octal) {
        int number = 0;
        int base = 1;

        int last_digit;
        int temp = octal;
        while (temp >0) {
            last_digit = temp % 10;
            temp = temp/10;
            number += last_digit * base;
            base *= 8;
        }
        return number;
    }
}
