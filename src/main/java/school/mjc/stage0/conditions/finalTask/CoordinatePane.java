package school.mjc.stage0.conditions.finalTask;

public class CoordinatePane {
    public void printQuadrant(int x, int y) {
        boolean isDown = false;
        boolean isLeft = false;
        boolean isZero = false;
        if ( x == 0 && y == 0) {
            isZero = true;
        } else if(x < 0) {
            isLeft = true;
        } if (y < 0) {
            isDown = true;
        }
        if (isZero){
            System.out.println("zero");
        } else if (isLeft && isDown) {
            System.out.println("third");
        } else if (!isLeft && !isDown) {
            System.out.println("first");
        } else if (isLeft && !isDown) {
            System.out.println("second");
        } else {
            System.out.println("fourth");
        }
    }
}
