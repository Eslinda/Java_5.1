package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class SQRServiceTest {

    @ParameterizedTest
    @CsvFileSource(resources={"/Limitdata.csv"})

    public void numberSquare(int limit1, int limit2, int expected) {
        SQRService service = new SQRService();
        int actual = service.squareCalculation(limit1, limit2);

        Assertions.assertEquals(expected, actual);

    }
}
