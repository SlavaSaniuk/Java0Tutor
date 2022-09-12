package by.saniuk.cycles;

public class CyclesTaskThird {

    public int calculate() {
        int res=0;
        for (int i=1; i<=100; i++) {
            res+=Math.pow(i,2);
        }

        return res;
    }

}
