package linear;

import utils.Task;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TaskFour extends Task {

    private double num;
    private boolean isConstructorWithNumberUsed = false;

    public TaskFour() {
        super(4,
                "Swap the fractional and integer parts of the number and print the resulting value of the number ");
    }

    public TaskFour(double aNumber) {
        this();
        this.num = aNumber;
        this.isConstructorWithNumberUsed = true;
    }

    @Override
    public void execute() {

        if (!this.isConstructorWithNumberUsed) {
            try (Scanner sc = new Scanner(System.in)) {
                // User input:
                System.out.println("Enter number in format ddd.fff:");
                this.num = sc.nextDouble();

            }catch (InputMismatchException exc) {
                System.out.println("Error - Invalid number!");
            }
        }

        int intPart = (int) this.num;
        int fracPart = (int) (this.num%1*1000);
        super.answer = Double.parseDouble(fracPart +"." +intPart);
    }
}
