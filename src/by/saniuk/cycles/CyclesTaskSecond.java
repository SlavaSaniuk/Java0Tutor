package by.saniuk.cycles;

/**
 * Cycles task 2.
 * Task: Вычислить значения функции на отрезке [а,Ь] с шагом h: y={x, if x>2; -x, if x <= -2}.
 */
public class CyclesTaskSecond {

    private final double a,b,h; // Start/end period and step (Initialized in constructor);

    /**
     * Initialize start and end of period, and it's step.
     * @param anA - start of period.
     * @param aB - end of period.
     * @param aH - step of period.
     */
    public CyclesTaskSecond(double anA, double aB, double aH) {
        this.a = anA;
        this.b = aB;
        this.h = aH;
    }

    /**
     * Calculate function result in period on any steps and print it's.
     */
    public void calculate() {
        double res;
        for (double i=a; i<=b; i+=h) {

            if (i <= 2) res = i*(-1); // if i<=2, then:
            else res = i;

            System.out.printf("Function result[h=%.1f]: %.2f; \n", i, res);
        }
    }
}
