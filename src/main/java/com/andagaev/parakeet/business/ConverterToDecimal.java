package com.andagaev.parakeet.business;

public class ConverterToDecimal {
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
