package by.saniuk.cycles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CyclesTaskSeven {

    private int m,n;

    public CyclesTaskSeven(Scanner sc) {
        try {
            System.out.println("Enter m:");
            m = sc.nextInt();

            System.out.println("Enter n:");
            n = sc.nextInt();
        }catch (InputMismatchException exc) {
            System.out.println("Exception! Invalid number.");
        }
    }

    public void printDivisorsForPeriod() {

        for (int i=m; i<=n; i++) {
            int j=2;
            while (j<i-1) {
                if (i%j==0) System.out.printf("For %d divisor - %d;%n", i, j);
                j++;
            }
        }
    }

}
