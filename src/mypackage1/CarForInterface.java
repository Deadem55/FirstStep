package mypackage1;

public class CarForInterface implements Transport, Interface2 {  // для реализации интерфейса - написать в названии класса implenemts (название интерфейса)
    @Override
    public void go() {
        System.out.println("We are driving!");
    }

    @Override
    public void stop() {
        System.out.println("We are driving slower!");
    }

    @Override
    public void method1() {
        System.out.println("test1");
    }

    @Override
    public void method2() {
        System.out.println("test2");
    }
}
