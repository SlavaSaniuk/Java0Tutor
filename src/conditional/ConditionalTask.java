package conditional;

import utils.Task;

public abstract class ConditionalTask extends Task {

    public ConditionalTask(int aTaskNumber, String aTaskName) {
        super(aTaskNumber, aTaskName);
    }

    @Override
    public void printTask() {
        System.out.printf("Conditional task %d: %s:%n", super.taskNumber, super.taskName);
    }

}
