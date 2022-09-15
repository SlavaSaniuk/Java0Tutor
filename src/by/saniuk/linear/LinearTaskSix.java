package by.saniuk.linear;

/**
 * Linear task N6.
 * Task: Для данной области составить линейную программу, которая печатает true, если точка с координатами (х, у)
 * принадлежит закрашенной области, и false - в противном случае:
 */
public class LinearTaskSix {

    private final int x11,y11,x12,y12, x21,y21,x22,y22; // Vertex of area square (initialized in constructor);
    private int x,y; // Points coordinates (initialized via setter);

    /**
     * Construct new {@link LinearTaskSix} task object.
     */
    public LinearTaskSix() {
        this.x11=-2;
        this.y11 = 4;
        this.x12 = 2;
        this.y12 = 0;

        this.x21=-4;
        this.y21=-1;
        this.x22 = 4;
        this.y22 = -3;
    }

    /**
     * Set point coordinates: x and y.
     * @param aX - x coordinate.
     * @param aY - y coordinate.
     */
    public void setPointCoordinates(int aX, int aY) {
        this.x = aX;
        this.y = aY;
    }

    public boolean isPointInShadedArea() {

        boolean isInX = false;
        boolean isInY = false;

        //Check if point in first square:
        if(x >= x11 && x <= x12) isInX=true;
        if(y <= y11 && y >= y12) isInY=true;
        if (isInX && isInY) {
            return true;
        }

        //Check if point in second square:
        isInX = false; isInY = false;
        if(x >= x21 && x <= x22) isInX=true;
        if(y <= y21 && y >= y22) isInY=true;
        return isInX && isInY;
    }

    public void print() {
        System.out.printf("Is point[%d, %d] in shaded area: %b; \n", this.x, this.y, this.isPointInShadedArea());
    }
}
