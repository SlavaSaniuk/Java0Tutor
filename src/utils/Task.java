package utils;

import java.util.Objects;

public abstract class Task {

    protected String taskName;

    protected int taskNumber;
    protected Object answer;

    public Task(int aTaskNumber, String aTaskName) {
        this.taskNumber = aTaskNumber;
        this.taskName = aTaskName;
    }

    public abstract void execute();

    public void printTask() {
        System.out.printf("Task %d: %s:%n", this.taskNumber, this.taskName);
    }

    public void printAnswer() {
        System.out.println("Answer: " +this.answer.toString());
    }
}
