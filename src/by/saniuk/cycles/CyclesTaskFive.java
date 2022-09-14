package by.saniuk.cycles;

/**
 * Cycles task N5;
 * Tasl:
 * Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен заданному е.
 * Общий член ряда имеет вид: A[n] = (1/Math.pow(2,n)) + (1/Math.pow(3,n)).
 */
public class CyclesTaskFive {

    private final double e; //E (initialized in constructor);

    /**
     * Map requested E number and create new {@link CyclesTaskFive} task object.
     * @param anE - Requested E.
     */
    public CyclesTaskFive(double anE) {
        // Map arguments:
        this.e = anE;
    }

    /**
     * Calculate sum of members of series which absolute value >= requested E (initialized in constructor).
     * @return - sum of members of series which meet the task condition.
     */
    public double calculateSum() {

        double result=0; // resulting sum;
        double n=1; //increment value;
        double a = (1/Math.pow(2,n)) + (1/Math.pow(3,n));

        while (Math.abs(a)>e) {
            result +=a;
            n++;
            a = (1/Math.pow(2,n)) + (1/Math.pow(3,n));
        }

        return result;
    }
}
