package by.saniuk.cycles;

public class CyclesTaskEight {

    private boolean isOne;
    private boolean isTwo;
    private boolean isThree;
    private boolean isFour;
    private boolean isFive;
    private boolean isSix;
    private boolean isSeven;
    private boolean isEight;
    private boolean isNine;
    private boolean isZero;

    private double a = 3453434.456456;

    public void printShareDigits() {

        int d = 10;
        boolean divIntPart = true;

        while (divIntPart) {
            int intPart = (int) a;
            int divRes = (int) intPart%d;
            if (divRes != 0) {
                System.out.println("Digit: " +divRes);
7                intPart = intPart / d;
            }else {
                divIntPart = false;
            }

        }

    }


}
