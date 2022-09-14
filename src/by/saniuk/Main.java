package by.saniuk;

import by.saniuk.conditional.*;
import by.saniuk.cycles.*;

import java.util.Scanner;

public class Main {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        TaskExecutor executor = new TaskExecutorImpl();

        executor.excecute(new TaskOne(4, 5, 6));
        executor.excecute(new TaskTwo(4, 5, 6));
        executor.excecute(new TaskThree(3, 4));
        executor.excecute(new TaskFour(123.456));
        executor.excecute(new TaskFive(56789));

        // Result: true
        executor.excecute(new TaskSix(2, 3));
        executor.excecute(new TaskSix(-2, -2));
        executor.excecute(new TaskSix(0, 0));
        // Result: false
        executor.excecute(new TaskSix(6, -2));
        executor.excecute(new TaskSix(4, 3));

        /*
         * ====================================================
         * ============ Операции ветвления ====================
         */
        executor.excecute(new ConditionalTaskOne(90, 270));
        executor.excecute(new ConditionalTaskOne(89, 89));
        executor.excecute(new ConditionalTaskOne(90, 45));

        executor.excecute(new ConditionalTaskTwo(1,2,3, 270));
        executor.excecute(new ConditionalTaskTwo(5,4,3,2));
        executor.excecute(new ConditionalTaskTwo(6,5, 45, 5));

        // Задачи ветвления, задача 3:
        // Точки не лежат на одной прямой:
        ConditionalTaskThree conditionalTaskThree = new ConditionalTaskThree(2,4,5,6,7,8);
        System.out.println("Branch task 3(1): Is points lie on same line: " +conditionalTaskThree.isLieOnSameLine());
        // Точки лежат на одной прямой:
        ConditionalTaskThree conditionalTaskThree2 = new ConditionalTaskThree(1,8,-2,-7,-4,-17);
        System.out.println("Branch task 3(2): Is points lie on same line: " +conditionalTaskThree2.isLieOnSameLine());

        // Задачи ветвления, задача 4:
        // Кирпич не пройдет в отверстие:
        BranchTaskFour branchTaskFour = new BranchTaskFour(5,6);
        branchTaskFour.setBrickSize(8,7,10);
        System.out.println("Branch task 4(1): Is brick[8,7,10] go throw hole[5,6]: " +branchTaskFour.isBrickGoThrowHole());
        // Кирпич пройдет в отверстие:
        branchTaskFour.setBrickSize(8,6,5);
        System.out.println("Branch task 4(2): Is brick[8,6,5] go throw hole[5,6]: " +branchTaskFour.isBrickGoThrowHole());

        // Задачи ветвления, задача 5:
        // Введите X с клавиатуры:
        //BranchTaskFive branchTaskFive = new BranchTaskFive();
        //System.out.println("Branch task 5(1): Function result: " +branchTaskFive.calculate());
        // Передача X через конструктор:
        BranchTaskFive branchTaskFive = new BranchTaskFive(-2.8);
        System.out.println("Branch task 5(2): Function result(x=-2.8): " +branchTaskFive.calculate());

        // Задачи по циклам, задача 1:
        CyclesTaskFirst cyclesTaskFirst= new CyclesTaskFirst(Main.SCANNER);
        System.out.println("Cycle task 1: Function result:  " +cyclesTaskFirst.calculate());

        // Задачи по циклам, задача 2:
        System.out.println("========================= Cycle task N2 =========================");
        double start = -90, end = 90, step = 15.5;
        System.out.printf("Period[start: %.2f, end: %.2f, step: %.2f]: \n", start, end, step);
        new CyclesTaskSecond(start, end, step).calculate();
        System.out.println("======================= End of Cycle task N2 ====================");

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
