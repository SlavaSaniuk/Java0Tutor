package by.saniuk.cycles;

public class CyclesTaskSecond {

    private final double a,b,h;

    public CyclesTaskSecond(double anA, double aB, double aH) {
        this.a = anA;
        this.b = aB;
        this.h = aH;
    }

    public void calculate() {
        for (double i=a; i<=b; i+=h) {
            double res;
            if (h <= 2) res = i*-1;
            else res = i;
            System.out.println("Cycle task 2: Function result on h=" +i +": " +res);
        }
    }
}
