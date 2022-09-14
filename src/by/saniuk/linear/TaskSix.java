package by.saniuk.linear;

import by.saniuk.Task;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TaskSix extends Task {

    private int x11,y11,x12,y12, x21,y21,x22,y22, x, y;
    private boolean isConstructorWithNumberUsed = false;

    public TaskSix() {
        super(6,
                "Swap the fractional and integer parts of the number and print the resulting value of the number ");
        this.x11=-2;
        this.y11 = 4;
        this.x12 = 2;
        this.y12 = 0;

        this.x21=-4;
        this.y21=-1;
        this.x22 = 4;
        this.y22 = -3;

    }

    public TaskSix(int aX, int aY) {
        this();
        this.x = aX;
        this.y = aY;
        this.isConstructorWithNumberUsed = true;
    }

    @Override
    public void execute() {

        if (!this.isConstructorWithNumberUsed) {
            try (Scanner sc = new Scanner(System.in)) {
                // User input:
                System.out.println("Enter X:");
                this.x = sc.nextInt();

                System.out.println("Enter Y:");
                this.y = sc.nextInt();

            }catch (InputMismatchException exc) {
                System.out.println("Error - Invalid number!");
            }
        }

        boolean isInX = false;
        boolean isInY = false;

        //Check if point in first square:
        if(x >= x11 && x <= x12) isInX=true;
        if(y <= y11 && y >= y12) isInY=true;
        if (isInX && isInY) {
            super.answer = true;
            return;
        }

        //Check if point in second square:
        isInX = false; isInY = false;
        if(x >= x21 && x <= x22) isInX=true;
        if(y <= y21 && y >= y22) isInY=true;
        if (isInX && isInY) super.answer = true;
        else super.answer = false;
    }
}
