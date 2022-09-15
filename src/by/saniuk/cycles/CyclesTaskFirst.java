package by.saniuk.cycles;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Cycles task N1.
 * Task: Напишите программу, где пользователь вводит любое целое положительное число.
 * А программа суммирует все числа от 1 до введенного пользователем числа.
 */
public class CyclesTaskFirst {

    private int a;

    /**
     * Construct {@link CyclesTaskFirst} object and initialize number from user input.
     * @param sc - {@link Scanner} for gets user input.
     */
    public CyclesTaskFirst(Scanner sc) {
        try {
            System.out.print("Enter int number: ");
            this.a = sc.nextInt();
        }catch (InputMismatchException exc) {
            System.out.println("Exception! Invalid number.");
        }
    }

    /**
     * Calculate sum of numbers from 1 to requested number.
     * @return - sum of numbers.
     */
    public long calculate() {
        long sum=0;
        for (int i=1; i<=this.a; i++) sum+=i;
        return sum;
    }
}
