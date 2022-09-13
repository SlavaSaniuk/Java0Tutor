package by.saniuk;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TaskThree extends Task {

    private double x,y;
    private boolean isConstructorWithNumberUsed = false;

    public TaskThree() {
        super(3, "Calculate: ((Math.sin(x) + Math.cos(y))/(Math.cos(x) - Math.sin(y)))*Math.tan(x*y)");
    }

    public TaskThree(int x, int y) {
        this();
        this.x = x;
        this.y = y;

        this.isConstructorWithNumberUsed = true;
    }



    @Override
    public void execute() {
        if (!this.isConstructorWithNumberUsed) {
            try (Scanner sc = new Scanner(System.in)) {
                // User input:
                System.out.println("Enter a:");
                this.x = sc.nextDouble();

                System.out.println("Enter b:");
                this.y = sc.nextDouble();

            }catch (InputMismatchException exc) {
                System.out.println("Error - Invalid number!");
            }
        }

        super.answer = ((Math.sin(x) + Math.cos(y))/(Math.cos(x) - Math.sin(y)))*Math.tan(x*y);
    }





}
