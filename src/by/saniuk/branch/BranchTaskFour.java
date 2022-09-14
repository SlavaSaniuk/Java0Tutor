package by.saniuk.branch;

public class BranchTaskFour {

    private final double a,b;
    private double x,y,z;

    public BranchTaskFour(double anA, double aB) {
        this.a = anA;
        this.b = aB;
    }

    public void setBrickSize(double aX, double aY, double aZ) {
        this.x = aX;
        this.y = aY;
        this.z = aZ;
    }

    public boolean isBrickGoThrowHole() {
        // Check X-Y side:
        if (((a>=x) && (b>=y)) || ((a>=y) && (b>=x))) return true;
        // Check X-Z side:
        if (((a>=x) && (b>=z)) || ((a>=z) && (b>=x))) return true;
        // Check Y-Z side:
        return ((a >= y) && (b >= z)) || ((a >= z) && (b >= y));
    }

}
