package com.andagaev.parakeet.business;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ConverterTest {
    @Test
    public void decimalToOctal_numberLessThan0_True() {
        int result = Converter.decimalToOctal(-1);

        Assertions.assertEquals(0, result);
    }

    @Test
    public void decimalToOctal_numberEquals0_True() {
        int result = Converter.decimalToOctal(0);

        Assertions.assertEquals(0, result);
    }

    @Test
    public void decimalToOctal_numberGreaterThan0_True() {
        int result = Converter.decimalToOctal(100);

        Assertions.assertEquals(144, result);
    }

}
