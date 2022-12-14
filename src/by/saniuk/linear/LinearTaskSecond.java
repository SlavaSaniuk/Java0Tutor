package by.saniuk.linear;

import by.saniuk.Task;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Linear task N2.
 * Вычислить значение выражения по формуле (все переменные принимают действительные значения):
 * b +(Math.sqrt(Math.pow(b, 2) + 4*a*c)))/(2*a))-Math.pow(a, 3)*c+Math.pow(b, -2)
 */
public class LinearTaskSecond extends Task {

    private double a,b,c;
    private boolean isConstructorWithNumberUsed = false;

    public LinearTaskSecond() {
        super(2, "Calculate: b +(Math.sqrt(Math.pow(b, 2) + 4*a*c)))/(2*a))-Math.pow(a, 3)*c+Math.pow(b, -2");
    }

    public LinearTaskSecond(int a, int b, int c) {
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

        super.answer = ((this.b +(Math.sqrt(Math.pow(this.b, 2) + 4*this.a*this.c)))/(2*this.a))-Math.pow(this.a, 3)*this.c+Math.pow(this.b, -2);
    }





}
