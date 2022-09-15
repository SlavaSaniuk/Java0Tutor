package by.saniuk.linear;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Linear task N4.
 * Task: Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях). Поменять местами
 * дробную и целую части числа и вывести полученное значение числа.
 */
public class LinearTaskFour {

    private final double num; // number (initialized in constructor);

    /**
     * Construct new {@link LinearTaskFour} task object with double number.
     * @param aNumber - double number;
     */
    public LinearTaskFour(double aNumber) {
        this.num = aNumber;
    }

    /**
     * Change integer part with decimal part.
     * @return - String.
     */
    public String changeIntDecParts() {
        int intPart = (int) this.num;
        int fracPart = (int) (this.num%1*1000);
        return String.valueOf(Double.parseDouble(fracPart +"." +intPart));
    }
}
