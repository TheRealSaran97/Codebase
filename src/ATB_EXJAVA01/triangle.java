package ATB_EXJAVA01;

public class triangle {
    public static void main(String[] args) {
        int angle1 = 1;
        int angle2 = 2;
        int angle3 = 3;
        if (angle1 == angle2 && angle2 == angle3) {
            System.out.println("Equilateral triangle");
        } else if (angle1 == angle2 || angle2 == angle3 || angle3 == angle1) {
            System.out.println("Isoceles triangle");

        } else {
            System.out.println("scalene triangle");
        }
    }
    }

