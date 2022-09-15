package by.saniuk.linear;

/**
 * Linear task N2.
 * Вычислить значение выражения по формуле (все переменные принимают действительные значения):
 * b +(Math.sqrt(Math.pow(b, 2) + 4*a*c)))/(2*a))-Math.pow(a, 3)*c+Math.pow(b, -2)
 */
public class LinearTaskSecond {

    private final double a,b,c; // statement variables (initialized in constructor);

    /**
     * Construct new {@link LinearTaskSecond} task object with statement variables.
     * @param anA - first variable.
     * @param aB - second variable.
     * @param aC - third variable.
     */
    public LinearTaskSecond(int anA, int aB, int aC) {
        this.a = anA;
        this.b = aB;
        this.c = aC;
    }

    /**
     * Calculate statement.
     * @return - statement calculation result.
     */
    public double calculate() {
        return  ((this.b +(Math.sqrt(Math.pow(this.b, 2) + 4*this.a*this.c)))/(2*this.a))-Math.pow(this.a, 3)*this.c+Math.pow(this.b, -2);
    }





}
