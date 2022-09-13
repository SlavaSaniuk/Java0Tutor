package by.saniuk;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TaskFive extends Task {

    private int timeInSeconds;
    private boolean isConstructorWithNumberUsed = false;

    public TaskFive() {
        super(5,
                "Swap the fractional and integer parts of the number and print the resulting value of the number ");
    }

    public TaskFive(int aNumber) {
        this();
        this.timeInSeconds = aNumber;
        this.isConstructorWithNumberUsed = true;
    }

    @Override
    public void execute() {

        if (!this.isConstructorWithNumberUsed) {
            try (Scanner sc = new Scanner(System.in)) {
                // User input:
                System.out.println("Enter number in format ddd.fff:");
                this.timeInSeconds = sc.nextInt();

            }catch (InputMismatchException exc) {
                System.out.println("Error - Invalid number!");
            }
        }

        //Calculate hours:

        int hour = this.timeInSeconds/3600;
        int min = (this.timeInSeconds-hour*3600)/60;
        int sec = this.timeInSeconds-(hour*3600) -(min*60);


        super.answer = String.format("%dh %dmin %ds", hour, min,sec);

    }
}
