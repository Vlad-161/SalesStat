package ru.netology.stats.sales.statsservice;

public class StatsService {
    public long allSales(long[] sales) {
        long summ = 0;
        for (long sale : sales) {
            summ += sale;
        }
        return summ;
    }

    public long averSalesMonth(long[] sales) {
        int numberSale = sales.length;
        long summ = allSales (sales);
        long averMonth = summ / numberSale;
        return averMonth;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }

        return minMonth + 1;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }

        return maxMonth + 1;
    }

    public int underAverSalesMonth(long[] sales) {
        long averSumm = averSalesMonth(sales);
        int underAverSalesMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < averSumm) {
                underAverSalesMonth = underAverSalesMonth + 1;
            }
        }
        return underAverSalesMonth;
    }

    public int overAverSalesMonth(long[] sales) {
        long averSumm = averSalesMonth(sales);
        int overAverSalesMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < averSumm) {
                overAverSalesMonth = overAverSalesMonth + 1;
            }
        }
        return overAverSalesMonth;
    }


}
