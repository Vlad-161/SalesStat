package ru.netology.stats.sales.statsservice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    void CalcAllSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.allSales(sales);

        int expected = 180;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void calcAverSalesMonth() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = service.averSalesMonth(sales);
        int expected = 15;

        Assertions.assertEquals(expected, actual);
    }


    @Test
    void CalcMinSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.minSales(sales);

        int expected = 9;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void CalcMaxSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.maxSales(sales);

        int expected = 8;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void CalcUnderAverSales() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = service.underAverSalesMonth(sales);

        int expected = 5;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void CalcOverAverSales() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = service.overAverSalesMonth(sales);

        int expected = 5;

        Assertions.assertEquals(expected, actual);
    }

}