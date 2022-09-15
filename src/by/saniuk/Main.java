package by.saniuk;

import by.saniuk.branch.*;
import by.saniuk.cycles.*;
import by.saniuk.linear.*;

import java.util.Scanner;

public class Main {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {

        /* ********************************************************************************************
         *********************************** Линейные задачи  *****************************************
         * ********************************************************************************************
         */

        // Линейные задачи, задача 1:
        System.out.println("========================= Linear task N1 =========================");
        LinearTaskFirst linearTaskFirst1 = new LinearTaskFirst(1,2,3);
        System.out.printf("z=((1-3)*2/2)+3=%.2f; \n", linearTaskFirst1.calculate());
        LinearTaskFirst linearTaskFirst2 = new LinearTaskFirst(4,5,6);
        System.out.printf("z=((4-3)*5/2)+6=%.2f; \n", linearTaskFirst2.calculate());
        System.out.println("======================= End of linear task N1 ====================");

        // Линейные задачи, задача 2:
        System.out.println("========================= Linear task N2 =========================");
        LinearTaskSecond linearTaskSecond = new LinearTaskSecond(4,5,6);
        System.out.printf("5+(Math.sqrt(Math.pow(5, 2) + 4*4*6)))/(2*4))-Math.pow(4, 3)*6+Math.pow(5, -2)=%.2f; \n",
                linearTaskSecond.calculate());
        System.out.println("======================= End of linear task N2 ====================");

        // Линейные задачи, задача 3:
        System.out.println("========================= Linear task N3 =========================");
        LinearTaskThird linearTaskThird = new LinearTaskThird(4,5);
        System.out.printf("((Math.sin(x) + Math.cos(y))/(Math.cos(x) - Math.sin(y)))*Math.tan(x)*y=%.2f; \n",
                linearTaskThird.calculate());
        System.out.println("======================= End of linear task N3 ====================");

        // Линейные задачи, задача 4:
        System.out.println("========================= Linear task N4 =========================");
        double changeVar = 123.456D;
        LinearTaskFour linearTaskFour = new LinearTaskFour(changeVar);
        System.out.printf("Change integer and decimal parts: %.3f -> %s; \n", changeVar,
                linearTaskFour.changeIntDecParts());
        System.out.println("======================= End of linear task N4 ====================");

        // Линейные задачи, задача 5:
        System.out.println("========================= Linear task N5 =========================");
        LinearTaskFive linearTaskFive = new LinearTaskFive(56789);
        linearTaskFive.printNormalTime();
        System.out.println("======================= End of linear task N5 ====================");

        // Линейные задачи, задача 6:
        System.out.println("========================= Linear task N6 =========================");
        LinearTaskSix linearTaskSix = new LinearTaskSix();

        linearTaskSix.setPointCoordinates(2,3);
        linearTaskSix.print(); // True;

        linearTaskSix.setPointCoordinates(6,-2);
        linearTaskSix.print(); // False;
        System.out.println("======================= End of linear task N6 ====================");


        /* ********************************************************************************************
         *********************************** ЗАДАЧИ НА ТЕМУ "Ветвление" *******************************
         * ********************************************************************************************
         */

        // Задачи ветвления, задача 1:
        System.out.println("========================= Branch task N1 =========================");
        BranchTaskFirst branchTaskFirst1 = new BranchTaskFirst(89, 89); // true, false;
        System.out.printf("Triangle[89, 89] exist - %b, is it right triangle - %b; \n",
                branchTaskFirst1.isTriangleExist(), branchTaskFirst1.isRightTriangle());
        BranchTaskFirst branchTaskFirst2 = new BranchTaskFirst(90, 90); // false, false;
        System.out.printf("Triangle[90, 90] exist - %b, is it right triangle - %b; \n",
                branchTaskFirst2.isTriangleExist(), branchTaskFirst2.isRightTriangle());
        BranchTaskFirst branchTaskFirst3 = new BranchTaskFirst(44, 46); // true, true;
        System.out.printf("Triangle[44, 46] exist - %b, is it right triangle - %b; \n",
                branchTaskFirst3.isTriangleExist(), branchTaskFirst3.isRightTriangle());
        System.out.println("======================= End of branch task N1 ====================");

        // Задачи ветвления, задача 2:
        System.out.println("========================= Branch task N2 =========================");
        System.out.printf("Max{min(1, 2), min(3, 270)}=%d; \n", new BranchTaskSecond(1,2,3, 270).execute());
        System.out.printf("Max{min(5, 4), min(3, 2)}=%d; \n", new BranchTaskSecond(5,4,3,2).execute());
        System.out.printf("Max{min(6, 5), min(45, 5)}=%d; \n", new BranchTaskSecond(6,5, 45, 5).execute());
        System.out.println("======================= End of branch task N2 ====================");

        // Задачи ветвления, задача 3:
        System.out.println("========================= Branch task N3 =========================");
        BranchTaskThird branchTaskThird = new BranchTaskThird(2,4,5,6,7,8);
        System.out.printf("Is points A(2,4), B(5,6), C(7,8) lie on same line: %b; \n"
                ,branchTaskThird.isLieOnSameLine()); // Точки не лежат на одной прямой;
        branchTaskThird = new BranchTaskThird(1,8,-2,-7,-4,-17);
        System.out.printf("Is points A(1,8), B(-2,-7), C(-4,-17) lie on same line: %b; \n",
                branchTaskThird.isLieOnSameLine()); // Точки лежат на одной прямой;
        System.out.println("======================= End of branch task N3 ====================");

        // Задачи ветвления, задача 4:
        System.out.println("========================= Branch task N4 =========================");
        BranchTaskFour branchTaskFour = new BranchTaskFour(5,6);
        branchTaskFour.setBrickSize(8,7,10); // Кирпич не пройдет в отверстие;
        System.out.printf("Is brick[w:8, h:7, l:10] go throw hole[w:5, h:6]: %b; \n",
                branchTaskFour.isBrickGoThrowHole());
        branchTaskFour.setBrickSize(8,6,5); // Кирпич пройдет в отверстие;
        System.out.printf("Is brick[w:8, h:6, l:5] go throw hole[w:5, h:6]: %b; \n",
                branchTaskFour.isBrickGoThrowHole());
        System.out.println("======================= End of branch task N4 ====================");

        // Задачи ветвления, задача 5:
        System.out.println("========================= Branch task N5 =========================");
        double x = -3.8;
        BranchTaskFive branchTaskFive = new BranchTaskFive(x);
        System.out.printf("F(%.2f)=%.2f; \n", x, branchTaskFive.calculate()); // x<=3
        x = 4;
        branchTaskFive = new BranchTaskFive(x);
        System.out.printf("F(%.2f)=%f; \n", x, branchTaskFive.calculate()); // x>3
        System.out.println("======================= End of branch task N5 ====================");

        /* ********************************************************************************************
        *********************************** ЗАДАЧИ НА ТЕМУ "Циклы" ************************************
        * *********************************************************************************************
         */

        // Задачи по циклам, задача 1:
        System.out.println("========================= Cycle task N1 ==========================");
        System.out.printf("Sum of numbers from 1 to number: %d; \n", new CyclesTaskFirst(Main.SCANNER).calculate());
        System.out.println("======================= End of Cycle task N1 =====================");

        // Задачи по циклам, задача 2:
        System.out.println("========================= Cycle task N2 ==========================");
        double start = -90, end = 90, step = 15.5;
        System.out.printf("Period[start: %.2f, end: %.2f, step: %.2f]: \n", start, end, step);
        new CyclesTaskSecond(start, end, step).calculate();
        System.out.println("======================= End of Cycle task N2 =====================");

        // Задачи по циклам, задача 3:
        System.out.println("========================= Cycle task N3 =========================");
        System.out.printf("Sum: %d; \n ", new CyclesTaskThird().calculate());
        System.out.println("======================= End of Cycle task N3 ====================");

        // Задачи по циклам, задача 4:
        System.out.println("========================= Cycle task N4 =========================");
        System.out.printf("Multiplication:  %d; \n", new CyclesTaskFour().calculate());
        System.out.println("======================= End of Cycle task N4 ====================");

        // Задачи по циклам, задача 5:
        System.out.println("========================= Cycle task N5 =========================");
        double e = 0.56D;
        System.out.printf("Sum[e=%f]: %f; \n", e, new CyclesTaskFive(0.56).calculateSum());
        System.out.println("======================= End of Cycle task N5 ====================");

        // Задачи по циклам. Задача 6:
        System.out.println("========================= Cycle task N6 =========================");
        new CyclesTaskSix().printAsciiSymbolsWithCodes();
        System.out.println("======================= End of Cycle task N6 ====================");

        // Задачи по циклам. Задача 7:
        System.out.println("========================= Cycle task N7 =========================");
        new CyclesTaskSeven(Main.SCANNER).printDivisorsForPeriod();
        System.out.println("======================= End of Cycle task N7 ====================");

        // Задачи по циклам. Задача 8:
        System.out.println("========================= Cycle task N8 =========================");
        double cycleTaskEightFirstNumber = 5687.304D, cycleTaskEightSecondNumber = 5631.978D;
        System.out.printf("The first number: %s, the second number %s; \n",
                cycleTaskEightFirstNumber, cycleTaskEightSecondNumber);
        CyclesTaskEight cyclesTaskEight =
                new CyclesTaskEight(cycleTaskEightFirstNumber, cycleTaskEightSecondNumber);
        System.out.printf("Shared digits: %s; \n", cyclesTaskEight.getShareDigits());
        System.out.println("======================= End of Cycle task N8 ====================");

        // Close scanner:
        Main.SCANNER.close();
    }
}
