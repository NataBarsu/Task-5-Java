package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SQRServiceTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/data.csv")
    public void shouldCalcSqrtService(int expected, int min, int max) {
        CalcSqrtService service = new CalcSqrtService();
        int actual = service.calcSqrt(min, max);
        Assertions.assertEquals(expected, actual);
    }
}
