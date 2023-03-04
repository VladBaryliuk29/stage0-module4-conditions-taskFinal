package school.mjc.stage0.conditions.finalTask;

public class TriangleSidesValidator {
    public void validate(double firstSide, double secondSide, double thirdSide) {
        boolean flag = true;
        if (firstSide + secondSide <= thirdSide) {
            flag = false;
        } else if(firstSide + thirdSide <= secondSide) {
            flag = false;
        } else if (secondSide + thirdSide <= firstSide) {
            flag = false;
        } else {
            System.out.println("this is a valid triangle");
        }
        if (flag == false) {
            System.out.println("it's not a triangle");
        }
    }
}
