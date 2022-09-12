package by.saniuk.cycles;

public class CyclesTaskFour {

    public long calculate() {
        long result = 1L;
        for (int i=1; i<=200; i++) {
            result *= Math.pow(i,2);
        }
        return result;
    }
}
