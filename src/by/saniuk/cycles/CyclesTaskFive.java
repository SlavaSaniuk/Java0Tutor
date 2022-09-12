package by.saniuk.cycles;

public class CyclesTaskFive {

    private double e;

    public CyclesTaskFive(double anE) {
        this.e = anE;
    }

    public double calculate() {

        double result=0;
        double n=1;
        double a = (1/Math.pow(2,n)) + (1/Math.pow(3,n));

        while (Math.abs(a)>e) {
            result +=a;
            n++;
            a = (1/Math.pow(2,n)) + (1/Math.pow(3,n));
        }

        return result;
    }
}
