import conditional.ConditionalTaskOne;
import conditional.ConditionalTaskTwo;
import linear.*;
import utils.TaskExecutor;
import utils.TaskExecutorImpl;

public class Main {

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
    }
}
