package by.saniuk.linear;

/**
 * Linear task N1.
 * Task: Найдите значение функции: z=((а-3)*Ь/2)+с.
 */
public class LinearTaskFirst {

    private final double a, b, c; // (initialized in constructor);

    /**
     * Construct new {@link LinearTaskFirst} task with 3 numbers.
     * @param anA - first number.
     * @param aB - second number.
     * @param aC - third number.
     */
    public LinearTaskFirst(double anA, double aB, double aC) {
        this.a = anA;
        this.b = aB;
        this.c = aC;
    }

    /**
     * Calculate function.
     * @return - function result.
     */
    public double calculate() {
        return ((a-3)* b/2)+c;
    }
}
