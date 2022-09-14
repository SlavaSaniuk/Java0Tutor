package by.saniuk.cycles;

/**
 * Cycles task 3.
 * Task: Найти сумму квадратов первых ста чисел.
 */
public class CyclesTaskThird {

    /**
     * Calculate sum of second degree first 100 numbers.
     * @return - Sum.
     */
    public int calculate() {
        int res=0;
        for (int i=1; i<=100; i++) {
            res+=Math.pow(i,2);
        }

        return res;
    }

}
