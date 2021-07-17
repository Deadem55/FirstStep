package mypackage1;

public abstract class AnimalAbstraction {

    public abstract void saySmth1(); // в абстрактном методе не ставятся фигурные скобки и не пишется тело метода
    public abstract void eat1();

    public void walk1(String place){
        System.out.println("I'm walking here: " + place);
    }
}
