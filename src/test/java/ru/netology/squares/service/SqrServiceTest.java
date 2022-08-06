package ru.netology.squares.service;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class SqrServiceTest {
        @ParameterizedTest
        @CsvSource({
                "3,200,300",
                "63,1000,9000",
                "39,805,4567",
                "90,1,10000",
                "8,555,999"

        })
    public void calcNumberOfSquares(int expected, int limitMin, int limitMax) {

        SqrService service = new SqrService();

        int actual = service.calcNumberOfSquares(limitMin, limitMax);

        Assertions.assertEquals(expected, actual);


    }
}