package by.saniuk.branch;

public class ConditionalTaskThree {

    private final int x1,y1,x2,y2,x3,y3;

    public ConditionalTaskThree(int aX1, int aY1, int aX2, int aY2, int aX3, int aY3) {
        this.x1 = aX1;
        this.y1 = aY1;
        this.x2 = aX2;
        this.y2 = aY2;
        this.x3 = aX3;
        this.y3 = aY3;
    }

    public boolean isLieOnSameLine() {
        double x,y;

        // Check X position:
        if (this.x2 - this.x1 != 0) {
            x = (this.x3-this.x1)/(this.x2-this.x1);
        }else x=0;

        // Check Y position:
        if (this.y2 - this.y1 !=0) {
            y = (this.y3-this.y1)/(this.y2-this.y1);
        }else y=0;

        return x == y;
    }

}
