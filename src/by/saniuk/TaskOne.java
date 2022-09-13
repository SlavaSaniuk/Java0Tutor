package by.saniuk;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TaskOne extends Task {

    private double a;
    private double b;
    private double c;

    private boolean isConstructorWithNumberUsed = false;

    public TaskOne() {
        super(1, "Calculate functions: z=((a-3)*b/2)+c");
    }

    public TaskOne(int a, int b, int c) {
        this();
        this.a = a;
        this.b = b;
        this.c = c;

        this.isConstructorWithNumberUsed = true;
    }

    @Override
    public void execute() {
        if (!this.isConstructorWithNumberUsed) {
            try (Scanner sc = new Scanner(System.in)) {
                // User input:
                System.out.println("Enter a:");
                a = sc.nextDouble();

                System.out.println("Enter b:");
                b = sc.nextDouble();

                System.out.println("Enter c:");
                c = sc.nextDouble();
            }catch (InputMismatchException exc) {
                System.out.println("Error - Invalid number!");
            }
        }


        super.answer = ((this.a - 3) * b / 2) + c;
    }
}
