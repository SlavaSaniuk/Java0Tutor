package by.saniuk.branch;

/**
 * Branch task N3.
 * Даны три точки А(х1,у1), В(х2,у2) и С(хЗ,уЗ). Определить, будут ли они расположены на одной прямой.
 */
public class BranchTaskThird {

    private final int x1,y1,x2,y2,x3,y3; // Points coordinates (initialized in constructor);

    /**
     * Construct new {@link BranchTaskThird} task object with points coordinates.
     * @param aX1 -x1.
     * @param aY1 -y1.
     * @param aX2 -x2.
     * @param aY2 -y2.
     * @param aX3 -x3.
     * @param aY3 -y3.
     */
    public BranchTaskThird(int aX1, int aY1, int aX2, int aY2, int aX3, int aY3) {
        this.x1 = aX1;
        this.y1 = aY1;
        this.x2 = aX2;
        this.y2 = aY2;
        this.x3 = aX3;
        this.y3 = aY3;
    }

    /**
     * Check if point A(x1,y1), B(x2,y2), C(x3,y3) lie on same line.
     * @return - true, if points lie on same line.
     */
    public boolean isLieOnSameLine() {
        double x,y;

        // Check X position:
        if (this.x2 - this.x1 != 0) {
            x = (double) (this.x3-this.x1)/(this.x2-this.x1);
        }else x=0;

        // Check Y position:
        if (this.y2 - this.y1 !=0) {
            y = (double) (this.y3-this.y1)/(this.y2-this.y1);
        }else y=0;

        return x == y;
    }

}
