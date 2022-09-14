package by.saniuk.cycles;

/**
 * Cycles task N6.
 * Task: Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера.
 * Use method {@link CyclesTaskSix#printAsciiSymbolsWithCodes()} to print symbols/code pairs to console.
 */
public class CyclesTaskSix {

    /**
     * Print symbol/code pair to console.
     */
    public void printAsciiSymbolsWithCodes() {
        for (int i=33; i<=127; i++)
            System.out.printf("Symbol: [%c], code [%d]; \n",(char) i, (byte) i);
    }
}
