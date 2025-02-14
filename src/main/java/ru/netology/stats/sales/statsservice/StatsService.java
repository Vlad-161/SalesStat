package ru.netology.stats.sales.statsservice;

public class StatsService {
    public int allSales(int[] sales) {
        int summ = 0;
        for (int sale : sales) {
            summ += sale;
        }
        return summ;
    }

    public int averSalesMonth(int[] sales) {
        int numberSale = sales.length;
        int summ = allSales (sales);
        int averMonth = summ / numberSale;
        return averMonth;
    }

    public int minSales(int[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }

        return minMonth + 1;
    }

    public int maxSales(int[] sales) {
        int maxMonth = sales[0];

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }

        return maxMonth + 1;
    }

    public int underAverSalesMonth(int[] sales) {
        int averSumm = averSalesMonth(sales);
        int underAverSalesMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < averSumm) {
                underAverSalesMonth = underAverSalesMonth + 1;
            }
        }
        return underAverSalesMonth;
    }

    public int overAverSalesMonth(int[] sales) {
        int averSumm = averSalesMonth(sales);
        int overAverSalesMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < averSumm) {
                overAverSalesMonth = overAverSalesMonth + 1;
            }
        }
        return overAverSalesMonth;
    }


}
