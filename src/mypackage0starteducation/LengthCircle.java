package mypackage0starteducation;

public class LengthCircle {
    public static void main(String[] args) {
        printCircleLength(5);
    }

    public static void printCircleLength(int radius) {
        double Pi = 3.14;
        double Length = 2 * Pi * radius;
        System.out.println(Length);
    }
}
