package by.saniuk.cycles;

/**
 * Cycles task N4.
 * Task. Составить программу нахождения произведения квадратов первых двухсот чисел.
 */
public class CyclesTaskFour {

    /**
     * Multiple of second degree first 200 numbers.
     * @return - multiplication.
     */
    public long calculate() {
        long result = 1L;
        for (int i=1; i<=200; i++) {
            result *= Math.pow(i,2);
        }
        return result;
    }
}
