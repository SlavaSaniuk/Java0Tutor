package by.saniuk.branch;

public class ConditionalTaskTwo extends ConditionalTask {

    private int a,b,c,d;

    public ConditionalTaskTwo(int aA, int aB, int aC, int aD) {
        super(1, "Found max{min(a, b), min (c,d)}");
        this.a = aA;
        this.b = aB;
        this.c = aC;
        this.d = aD;
    }

    @Override
    public void execute() {
        int min1, min2;

        min1 = a >= b ? b:a;
        min2 = c >= d ? d:c;

        super.answer = min1 >= min2 ? min1 : min2;
    }
}
