package by.saniuk.branch;

/**
 * Branch task N1.
 * Task: Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник,
 * и если да, то будет ли он прямоугольным.
 */
public class BranchTaskFirst {

    private final int a,b; // Triangle angles (initialized in constructors).

    /**
     * Construct new {@link BranchTaskFirst} task with two triangle angles.
     * @param a - first angle.
     * @param b - second angle.
     */
    public BranchTaskFirst(int a, int b) {
        this.a = a;
        this.b = b;
    }

    /**
     * Check if triangle exist.
     * @return - true if triangle exist.
     */
    public boolean isTriangleExist() {
        // Check 180:
        return (a + b) < 180;
    }

    /**
     * Check if triangle exist and is it right.
     * @return - true if triangle exist and it is right.
     */
    public boolean isRightTriangle() {
        if (!this.isTriangleExist()) return false;
        // if any angle is 90 degrees:
        return a==90 || b==90 || a+b==90;
    }
}
