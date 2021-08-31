package ru.netology.statistic;

public class StatisticsService {
    /**
     * Calculate index of max income
     *
     * @param incomes - array of incomes
     * @return - index of first max value
     */
    public long findMax(long[] incomes) {
        int currentMaxIndex = 0;
        int currentMax = 0;
        for (long income : incomes) {
            if (incomes[currentMax] < income) {
                currentMax = currentMaxIndex;
            }
            currentMaxIndex += 1;
        }
        return currentMax + 1;
    }
}
