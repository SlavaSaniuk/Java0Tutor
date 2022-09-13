package by.saniuk.cycles;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Cycles task N7.
 * Для каждого натурального числа в промежутке от m до n вывести все делители, кроме еденицы и самого числа.
 * m и n вводятся с клавиатуры.
 */
public class CyclesTaskSeven {

    private int m,n; // Start and end of period;

    /**
     * Construct new {@link  CyclesTaskSeven} task object.
     * This construct used to get user input of start and end numbers of period.
     * @param sc - {@link Scanner} scanner.
     */
    public CyclesTaskSeven(Scanner sc) {
        try {
            System.out.print("Enter start of period [m]: ");
            m = sc.nextInt();

            System.out.println("Enter end of period [n]: ");
            n = sc.nextInt();
        }catch (InputMismatchException exc) {
            System.out.println("Exception! Invalid number.");
        }
    }

    /**
     * Method iterates all integer numbers in period
     */
    public void printDivisorsForPeriod() {
        System.out.printf("For numbers in period [%d; %d] divisors: \n", this.m, this.n);

        // Iterates all integer numbers in period:
        for (int i=this.m; i<=this.n; i++) {

            StringBuilder sb = new StringBuilder();
            int j=2; // Because 1 is divisor for all numbers:

            while (j<(i-1)) {
                if (i%j==0) sb.append(j).append(",");
                j++;
            }

            if (!sb.toString().isEmpty()) System.out.printf("Number %d, divisors [%s]; \n", i, sb.substring(0, sb.toString().length()-1));
            sb.setLength(0); // Clear StringBuilder;
        }
    }

}
