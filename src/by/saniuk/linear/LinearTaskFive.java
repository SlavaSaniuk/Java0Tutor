package by.saniuk.linear;

/**
 * Linear task N5.
 * Task: Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. Вывести
 * данное значение длительности в часах, минутах и секундах в следующей форме:
 * ННч ММмин SSc.
 */
public class LinearTaskFive {

    private final int timeInSeconds; // Time in seconds (initialized in constructor);

    /**
     *  Construct new {@link LinearTaskFive} task object with time in seconds variable value.
     * @param aTimeIsSeconds - time in seconds.
     */
    public LinearTaskFive(int aTimeIsSeconds) {
        this.timeInSeconds = aTimeIsSeconds;
    }

    /**
     * Print time in seconds in format "HHh DDmin SSs".
     */
    public void printNormalTime() {

        // Calculate hours:
        int hour = this.timeInSeconds/3600;
        // Calculate minutes:
        int min = (this.timeInSeconds-hour*3600)/60;
        // Calculate seconds:
        int sec = this.timeInSeconds-(hour*3600) -(min*60);

        System.out.printf("Time[%d in seconds]: %dh %dmin %ds; \n", this.timeInSeconds, hour,min,sec);

    }
}
