package mypackage1;

public class TestClassForInterface {
    public static void main(String[] args) {

        CarForInterface car = new CarForInterface();
        Plane plane = new Plane();

        car.go();
        car.stop();
        System.out.println();
        car.method1();
        car.method2();
        System.out.println();
        plane.go();
        plane.getSpeed(380);
        plane.stop();
    }
}
