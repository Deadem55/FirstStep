package mypackage1;

public class Car {

    /*final*/ static int var = 10;  //final запрещает перезапись переменных и методов к которым применяется
    static void method() {
        System.out.println("Static method.");
    }

    public Car() {      // название конструктора - совпадает с именем класса
        System.out.println("New ExMachine created!");
    }
    public Car(String color) {
        this.color = color;
    }
    public Car(String color, int height, int width, int length) {
        this.color = color;
        this.height = height;
        this.width = width;
        this.length = length;
    }

    int height;
    int width;
    int length;
    int weight = 2000;
    int maxWeight = 2700;
    String color;
    int speed;
    int maxSpeed = 260;

    public void addWeight(int weight) {
        this.weight += weight;
        System.out.println("New weight = " + this.weight + "." + " For maxWeight = " + this.maxWeight);
    }

    public void drive(int speed) {
        if (weight <= maxWeight) {
            this.speed = speed;
            if (this.speed <= maxSpeed) {
                System.out.println("We drive on: " + this.speed + " Km/Hr");
            } else {
                System.out.println("Can't drive! maxSpeed = " + this.maxSpeed);
            }
        } else {
            System.out.println("Can't drive! MaxWeight = " + this.maxWeight);
        }
    }

}
