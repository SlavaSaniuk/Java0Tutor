package by.saniuk;

public class TaskExecutorImpl implements TaskExecutor{
    @Override
    public void excecute(Task aTask) {
        System.out.println("------------------------------------------------------------");
        aTask.printTask();
        aTask.execute();
        aTask.printAnswer();
        System.out.println("------------------------------------------------------------");
    }
}
