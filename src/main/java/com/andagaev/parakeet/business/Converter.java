package com.andagaev.parakeet.business;

/**
 * Converter class encapsulates conversion logic.
 * Put new conversion functions here and reuse in any place in the project
 */
public class Converter {
    /**
     * Converts decimal numbers to octal format
     *
     * @param number Decimal number
     * @return Octal number
     */
    public static int decimalToOctal(int number) {
        int result = 0;
        if (number <= 0) {
            return result;
        }
        int countval = 1;

        while (number != 0) {
            int remainder = number % 8;

            result += remainder * countval;

            countval = countval * 10;
            number /= 8;
        }

        return result;
    }

    /**
     * Converts octal number to decimal
     *
     * @param number Octal number
     * @return Decimal number
     */
    public static int octalToDecimal(int number) {
        int result = 0;
        if (number <= 0) {
            return result;
        }
        int countval = 1;

        while (number != 0) {
            int remainder = number % 10;

            result += remainder * countval;

            countval = countval * 8;
            number /= 10;
        }

        return result;
    }
}
