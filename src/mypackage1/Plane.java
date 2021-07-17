package mypackage1;

public class Plane implements Transport{
    @Override
    public void go() {
        System.out.println("We are flying on a plan!");
    }

    @Override
    public void stop() {
        System.out.println("We are landing!");
    }

    public void getSpeed(int speed) {
        System.out.println("Our speed is: " + speed);
    }
}
