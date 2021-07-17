package mypackage1;

public class TestClassForCar {
    public static void main(String[] args) {

        Car car1 = new Car();
        car1.color = "Black";
        car1.length = 5000;
        car1.height = 2000;
        car1.weight = 2000;
        System.out.println("Car Version 1:");
        car1.color = "Red";
        car1.addWeight(700);
        car1.drive(260);
        System.out.println();

        System.out.println("Car Version 2:");
        Car car2 = new Car();
        car2.color = "White";
        car2.addWeight(700);
        car2.drive(100);
        System.out.println();

        System.out.println("Car Version 3:");
        Car car5 = new Car("Yellow");
        System.out.println("Color of car 5: " + car5.color);
        System.out.println();

        System.out.println("Car Version 4:");
        Car car6 = new Car("Purple", 2100, 2000, 5000);
        System.out.println("Car 6 color is: " + car6.color);
        System.out.println("Car 6  height is: " + car6.height);
        System.out.println("Car 6  width is: " + car6.width);
        System.out.println("Car 6  length is: " + car6.length);
        System.out.println();

//        да просто можно насоздавать кучу объектов car - которые будут утягивать свойства описанные в классе Car
        Car car3 = new Car();
        Car car4 = new Car();
        Car carN = new Car();
        System.out.println();

        System.out.println(Car.var);
        Car.var = 100;
        System.out.println(car1.var);
        System.out.println(car2.var);
        System.out.println(car5.var);

        Car.method();
        System.out.println();

        String.format("New %s string", "string");
    }
}
