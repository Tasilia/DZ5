package ru.netology.sqr;

import static org.junit.jupiter.api.Assertions.*;

public class SQRServiceTest {

    @org.junit.jupiter.api.Test
    void testForPNumbersFrom1To9801() {
        SQRService service = new SQRService();
        int actual = service.calculate(200, 300);
        int expected = 3;
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void testForNumber9801() {
        SQRService service = new SQRService();
        int actual = service.calculate(9801, 9801);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void testForNumber100() {
        SQRService service = new SQRService();
        int actual = service.calculate(100, 100);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void testForNumbersBeyondTheLimit() {
        SQRService service = new SQRService();
        int actual = service.calculate(9802, 10000);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void testForNumbersUnderTheLimit() {
        SQRService service = new SQRService();
        int actual = service.calculate(-100, 99);
        int expected = 0;
        assertEquals(expected, actual);
    }


}

