package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StatisticsServiceTest {

    @Test
    void findMax() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }

    @Test
    void findAssert(){
        StatisticsService service = new StatisticsService(); //  создаем копию сервиса

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12,13}; //передаем данные
        long expected = 13; // ожидаемый результат

        long actual = service.findMax(incomesInBillions);// актуальный результат. Вызываем использумый сервис и передаем в него массив с данными

        assertEquals(expected,actual);
    }
}