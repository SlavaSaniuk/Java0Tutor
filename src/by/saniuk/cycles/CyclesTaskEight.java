package by.saniuk.cycles;

/**
 * Cycles task N8.
 * Task: Даны 2 числа. Определить цифры входящие в запись как первого, так и второго числа.
 * Логика использования класа следующая:
 * 1) Первое число устанавливается в конструкторе {@link  CyclesTaskEight#CyclesTaskEight(double)}.
 * Конструктор разбивает число на целую и дробную части, перебирает каждую из частей по цифрам,
 * и устанавливает флаги использования цифр (isOneUsed, isTwoUsed ... true).
 * 2) Для установки второго числа, используются метод {@link CyclesTaskEight#setSecondNumber(double)}. Метод также
 * разбивает числа на части, перебирает их по цифрам, и если цифре установлен флаг использования (isOneUsed, isTowUsed ...),
 * устанавливает флаг повторения цифры (isOneRepeated, isTwoRepeated).
 * Конструктор {@link CyclesTaskEight#CyclesTaskEight(double, double)} объединяет первые 2 пункта в одну операцию.
 * 3) Метод {@link CyclesTaskEight#getShareDigits()} возвращает строку с общими цифрами для обои чисел.
 * Метод перебирает флаги повторения цифр, и выбирает только повторяющиеся цифры.
 */
public class CyclesTaskEight {


    // Used and repeated digits flags:
    private boolean isOneUsed, isOneRepeated = false;
    private boolean isTwoUsed, isTwoRepeated = false;
    private boolean isThreeUsed, isThreeRepeated = false;
    private boolean isFourUsed, isFourRepeated = false;
    private boolean isFiveUsed, isFiveRepeated = false;
    private boolean isSixUsed, isSixRepeated = false;
    private boolean isSevenUsed, isSevenRepeated = false;
    private boolean isEightUsed, isEightRepeated = false;
    private boolean isNineUsed, isNineRepeated = false;
    private boolean isZeroUsed, isZeroRepeated = false;

    /**
     * Constructor drop specified number at integer and decimal part, iterates all parts, and set used digits
     * via {@link CyclesTaskEight#setUsedDigits(int)} method.
     * @param aFirstNumber - a first number.
     */
    public CyclesTaskEight(double aFirstNumber) {
        // Separate first number on integer and decimal part:
        int integerPart = (int) aFirstNumber;

        String doubleAsString = String.valueOf(aFirstNumber);
        int decimalPart = Integer.parseInt(doubleAsString.substring(doubleAsString.indexOf('.')+1));

        // Set used digits of first numbers:
        this.setUsedDigits(integerPart);
        this.setUsedDigits(decimalPart);
    }

    /**
     * Construct combine {@link CyclesTaskEight#CyclesTaskEight(double)} constructor
     * and {@link CyclesTaskEight#setSecondNumber(double)}
     * method.
     * @param aFirstNumber - a first number.
     * @param aSecondNumber - a second number.
     */
    public CyclesTaskEight(double aFirstNumber, double aSecondNumber) {
        this(aFirstNumber);
        this.setSecondNumber(aSecondNumber);
    }

    /**
     * Method drop specified number at integer and decimal part, iterates all parts, and check repeated digits
     * via {@link CyclesTaskEight#checkRepeatedDigits(int)} method.
     * @param aSecondNumber - a second number.
     */
    public void setSecondNumber(double aSecondNumber) {
        // Separate first number on integer and decimal part:
        int integerPart = (int) aSecondNumber;

        String doubleAsString = String.valueOf(aSecondNumber);
        int decimalPart = Integer.parseInt(doubleAsString.substring(doubleAsString.indexOf('.')+1));

        // Set used digits of first numbers:
        this.checkRepeatedDigits(integerPart);
        this.checkRepeatedDigits(decimalPart);
    }

    /**
     * Method iterates all digits in specified aNumber param,
     * and set used digits via {@link CyclesTaskEight#setUsedDigit(int)} method.
     * @param aNumber - any number.
     */
    private void setUsedDigits(int aNumber) {

        boolean isIterPart = true;

        while (isIterPart) {
            int delPart = aNumber/10;
            if (delPart == 0) isIterPart = false;
            int digit = aNumber-(delPart*10);
            this.setUsedDigit(digit);
            aNumber = delPart;
        }

    }

    /**
     * Method iterates all digits in specified number and check which digits already repeats
     * via {@link CyclesTaskEight#setRepeatedDigit(int)}.
     * @param aNumber - any number.
     */
    private void checkRepeatedDigits(int aNumber) {
        boolean isIterPart = true;

        while (isIterPart) {
            int delPart = aNumber/10;
            if (delPart == 0) isIterPart = false;
            int digit = aNumber-(delPart*10);
            this.setRepeatedDigit(digit);
            aNumber = delPart;
        }
    }

    /**
     * Method turn on used digit flag.
     * @param aDigit - used digit.
     */
    private void setUsedDigit(int aDigit) {
        switch (aDigit) {
            case 1 -> this.isOneUsed = true;
            case 2 -> this.isTwoUsed = true;
            case 3 -> this.isThreeUsed = true;
            case 4 -> this.isFourUsed = true;
            case 5 -> this.isFiveUsed = true;
            case 6 -> this.isSixUsed = true;
            case 7 -> this.isSevenUsed = true;
            case 8 -> this.isEightUsed = true;
            case 9 -> this.isNineUsed = true;
            case 0 -> this.isZeroUsed = true;
        }
    }

    /**
     * Method check if specified digit is repeated. if specified digit is repeated, method turn on repeated digit flag.
     * @param aDigit - any digit.
     */
    private void setRepeatedDigit(int aDigit) {
        switch (aDigit) {
            case 1 -> {
                if (this.isOneUsed) this.isOneRepeated = true;
            }
            case 2 -> {
                if (this.isTwoUsed) this.isTwoRepeated = true;
            }
            case 3 -> {
                if (this.isThreeUsed) this.isThreeRepeated = true;
            }
            case 4 -> {
                if (this.isFourUsed) this.isFourRepeated = true;
            }
            case 5 -> {
                if (this.isFiveUsed) this.isFiveRepeated = true;
            }
            case 6 -> {
                if (this.isSixUsed) this.isSixRepeated = true;
            }
            case 7 -> {
                if (this.isSevenUsed) this.isSevenRepeated = true;
            }
            case 8 -> {
                if (this.isEightUsed) this.isEightRepeated = true;
            }
            case 9 -> {
                if (this.isNineUsed) this.isNineRepeated = true;
            }
            case 0 -> {
                if (this.isZeroUsed) this.isZeroRepeated = true;
            }
        }
    }

    /**
     * Method return shared digits string. Method iterates all repeated digits flags and
     * if its is true - append it to result string.
     * @return - String of shared digits.
     */
    public String getShareDigits() {
        StringBuilder sb = new StringBuilder();
        if (this.isZeroRepeated) sb.append("0 ");
        if (this.isOneRepeated) sb.append("1 ");
        if (this.isTwoRepeated) sb.append("2 ");
        if (this.isThreeRepeated) sb.append("3 ");
        if (this.isFourRepeated) sb.append("4 ");
        if (this.isFiveRepeated) sb.append("5 ");
        if (this.isSixRepeated) sb.append("6 ");
        if (this.isSevenRepeated) sb.append("7 ");
        if (this.isEightRepeated) sb.append("8 ");
        if (this.isNineRepeated) sb.append("9 ");
        return sb.toString();
    }

}
