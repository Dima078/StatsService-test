package ru.netology.stats;

public class StatsService {
    public long calculateSum(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }


    public long calculateAverage(long[] sales) {
        return calculateSum(sales) / sales.length;
    }

    public long maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month++;
        }
        return maxMonth + 1;
    }

    public long minSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month++;
        }
        return minMonth + 1;
    }

    public long lowAverage(long[] sales) {
        int month = 0;
        long average = calculateAverage(sales);
        for (long sale : sales) {
            if (average > sale) {
                month++;
            }
        }
        return month;
    }

    public long upAverage(long[] sales) {
        int month = 0;
        long average = calculateAverage(sales);
        for (long sale : sales) {
            if (average < sale) {
                month++;
            }
        }
        return month;
    }
}