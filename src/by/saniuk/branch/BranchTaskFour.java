package by.saniuk.branch;

/**
 * Branch task N4.
 * Task: Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича.
 * Определить, пройдет ли кирпич через отверстие.
 */
public class BranchTaskFour {

    private final double a,b; // Hole size (initialized in constructor);
    private double x,y,z; // Brick size (initialized in setter);

    /**
     * Construct new {@link BranchTaskFour} task object with hole width and height.
     * @param anA - hole width.
     * @param aB - hole height.
     */
    public BranchTaskFour(double anA, double aB) {
        this.a = anA;
        this.b = aB;
    }

    /**
     * Set brick size.
     * @param aX - width.
     * @param aY - height.
     * @param aZ - length.
     */
    public void setBrickSize(double aX, double aY, double aZ) {
        this.x = aX;
        this.y = aY;
        this.z = aZ;
    }

    /**
     * Check if is the brick go throw the hole.
     * @return - true, if the brick go throws the hole.
     */
    public boolean isBrickGoThrowHole() {
        // Check X-Y side:
        if (((a>=x) && (b>=y)) || ((a>=y) && (b>=x))) return true;
        // Check X-Z side:
        if (((a>=x) && (b>=z)) || ((a>=z) && (b>=x))) return true;
        // Check Y-Z side:
        return ((a >= y) && (b >= z)) || ((a >= z) && (b >= y));
    }

}
