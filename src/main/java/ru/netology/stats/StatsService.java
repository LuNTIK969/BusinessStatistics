package ru.netology.stats;

public class StatsService {
    public long getSum(long[] months) {

        int totalAmount = 0;
        for (int i = 0; i < months.length; i++) {
            totalAmount += months[i];
        }
        return totalAmount;
    }

    public long getSumАverage(long[] months) {

        return getSum(months) / months.length;
    }

    public int getMaxSum(long[] months) {
        int maxAmount = 0;
        for (int sum = 0; sum < months.length; sum++) {
            if (months[sum] >= months[maxAmount]) {
                maxAmount = sum;
            }
        }
        return maxAmount + 1;
    }

    public int getMinSum(long[] months) {
        int minAmount = 0;
        for (int sum = 0; sum < months.length; sum++) {
            if (months[sum] <= months[minAmount]) {
                minAmount = sum;
            }
        }
        return minAmount + 1;
    }

    public int getBelowAverage(long[] months) {
        int belowAverage = 0;
        for (long month : months) {
            if (month < getSumАverage(months)) {
                belowAverage++;
            }
        }
        return belowAverage;
    }

    public int getAboveAverage(long[] months) {
        int aboveAverage = 0;
        for (long month : months) {
            if (month > getSumАverage(months)) {
                aboveAverage++;
            }
        }
        return aboveAverage;
    }

}


