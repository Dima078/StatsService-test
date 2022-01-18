package ru.netology.stats;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @org.junit.jupiter.api.Test
    void calculateSum() {
        StatsService service = new StatsService();
        long[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;
        long actual = service.calculateSum(month);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void calculateAverage() {
        StatsService service = new StatsService();
        long[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 15;
        long actual = service.calculateAverage(month);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void maxSales() {
        StatsService service = new StatsService();
        long[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 19};
        long expected = 8;
        long actual = service.maxSales(month);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void minSales() {
        StatsService service = new StatsService();
        long[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 9;
        long actual = service.minSales(month);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void lowAverage() {
        StatsService service = new StatsService();
        long[] month = {8, 15, 13, 15, 17, 20, 19, 20, 15, 14, 14, 18};
        long expected = 4;
        long actual = service.lowAverage(month);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void upAverage() {
        StatsService service = new StatsService();
        long[] month = {16, 15, 13, 15, 17, 20, 19, 20, 7, 14, 16, 18};
        long expected = 7;
        long actual = service.upAverage(month);
        assertEquals(expected, actual);
    }
}