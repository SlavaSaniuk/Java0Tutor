package by.saniuk.branch;

/**
 * Branch task N5.
 * Task: Вычислить значение функции: f(x) = {Math.pow(x,3)+6), if x>3; Math.pow(x,2)-3x+9, if x<=3}.
 */
public class BranchTaskFive {

    private final double x; // Initialized in constructor;

    /**
     * Set X and return new {@link BranchTaskFive} task object.
     * @param aX - x.
     */
    public BranchTaskFive(double aX) {
        this.x = aX;
    }

    /**
     * Calculate function result, based on x.
     * @return - function result.
     */
    public double calculate() {
        if (this.x <= 3) return Math.pow(this.x,2)-3*this.x+9;
        else { // if x>3:
            if ((Math.pow(x,3)+6) == 0) throw new ArithmeticException("Exception! Division on zero.");
            return 1/(Math.pow(x,3)+6);
        }
    }
}
