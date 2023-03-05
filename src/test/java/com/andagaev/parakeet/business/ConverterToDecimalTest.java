package com.andagaev.parakeet.business;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest

public class ConverterToDecimalTest {

    @Test
    public void octalToDecimal_numberLessThan0_True() {
        int result = ConverterToDecimal.octalToDecimal(-5);

        Assertions.assertEquals(0, result);
    }

    @Test
    public void octalToDecimal_numberEquals0_True() {
        int result = ConverterToDecimal.octalToDecimal(0);

        Assertions.assertEquals(0, result);
    }

    @Test
    public void octalToDecimal_numberGreaterThan0_True() {
        int result = ConverterToDecimal.octalToDecimal(100);

        Assertions.assertEquals(64, result);
    }
}
