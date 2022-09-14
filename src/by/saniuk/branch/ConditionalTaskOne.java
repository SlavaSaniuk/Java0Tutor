package by.saniuk.branch;


public class ConditionalTaskOne extends ConditionalTask {

    private int a,b;

    public ConditionalTaskOne(int a, int b) {
        super(0, "Dany dva ugla treugolnika");
        this.a = a;
        this.b = b;
    }


    @Override
    public void execute() {

        // Check 180:
        if ((a+b) >= 180) {
            super.answer = "Triangle not exist.";
            return;
        }

        // Check 90:
        if (a == 90 || b == 90 || 180-(a+b) ==90) {
            super.answer = "Triangle is exist. It's prjamougolniy.";
        }else {
            super.answer = "Triangle is exist. It's not prjamougolniy.";
        }
    }
}
