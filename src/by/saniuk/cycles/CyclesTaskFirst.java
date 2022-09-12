package by.saniuk.cycles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CyclesTaskFirst {

    private int a;

    public CyclesTaskFirst() {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter int number:");
            this.a = sc.nextInt();
        }catch (InputMismatchException exc) {
            System.out.println("Exception! Invalid number.");
        }
    }

    public long calculate() {
        long summ=0;
        for (int i=1; i<this.a; i++) summ+=i;
        return summ;
    }
}
