package by.saniuk.linear;

import by.saniuk.Task;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Linear task N3.
 * Task: Вычислить значение выражения по формуле (все переменные принимают действительные значения):
 * ((Math.sin(x) + Math.cos(y))/(Math.cos(x) - Math.sin(y)))*Math.tan(x)*y
 */
public class LinearTaskThird {

    private final double x,y; // Statement variables (initialized in constructor);

    /**
     * Construct new {@link LinearTaskThird} task object with statement variables.
     * @param aX - first variable.
     * @param aY - second variable.
     */
    public LinearTaskThird(int aX, int aY) {
        this.x = aX;
        this.y = aY;
    }

    /**
     * Calculate statement.
     * @return - statement calculation result.
     */
    public double calculate() {
        return ((Math.sin(x) + Math.cos(y))/(Math.cos(x) - Math.sin(y)))*Math.tan(x)*y;
    }





}
