package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class WorkingMonthsServicesTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/month.csv")
    public void countMonths(int expected, int income, int expenses, int threshold) {
        WorkingMonthsServices service = new WorkingMonthsServices();


        int actual = service.calculate(income, expenses, threshold);
        Assertions.assertEquals(expected, actual);
    }
}
