package by.saniuk.conditional;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BranchTaskFive {

    private double x;

    public BranchTaskFive() {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter X:");
            this.x = sc.nextDouble();
        }catch (InputMismatchException exc) {
            System.out.println("Exception! Invalid X.");
        }
    }

    public BranchTaskFive(double aX) {
        this.x = aX;
    }

    public double calculate() {
        if (this.x <= 3) return Math.pow(this.x,2)-3*this.x+9;
        else {
            if ((Math.pow(x,3)+6) == 0) throw new ArithmeticException("Exception! Division on zero.");
            return 1/(Math.pow(x,3)+6);
        }
    }
}
