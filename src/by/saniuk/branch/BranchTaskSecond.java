package by.saniuk.branch;

/**
 * Branch task N2.
 * Task: 2.	Найти max{min(а, Ь), min(c, d)}.
 */
public class BranchTaskSecond{

    private final int a,b,c,d; // numbers values (initialized in constructors).

    /**
     * Construct new {@link  BranchTaskSecond} task object with four numbers.
     * @param aA - number 1.
     * @param aB - number 2.
     * @param aC - number 3.
     * @param aD - number 4.
     */
    public BranchTaskSecond(int aA, int aB, int aC, int aD) {
        this.a = aA;
        this.b = aB;
        this.c = aC;
        this.d = aD;
    }

    /**
     * Calculate statement and max from min values.
     * @return - result value.
     */
    @SuppressWarnings("ManualMinMaxCalculation")
    public int execute() {
        int min1, min2;

        min1 = a >= b ? b:a;
        min2 = c >= d ? d : c;

        return min1 >= min2 ? min1 : min2;
    }
}
