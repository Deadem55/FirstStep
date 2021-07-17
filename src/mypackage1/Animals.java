package mypackage1;

public class Animals {
    protected String name;
    protected String color;

    public /*private*/ /*protected*/ int var;

    // public = переменная доступна везде, во всех частях программы.
    // private = переменная доступна только в текущем классе, в классах наследниках не доступна.
    // protected - можно обращаться внутри класса, внутри класса наследника, но нельзя обращаться внутри класса во внутреннем пакете.
    // " " (пустой модификатор доступа):  дефолтный модификатор доступа (называется package) - видимость параметра ограниивается пакетом. Во внешних пакетах не доступна для доступа
    public void walk(String place) {

        System.out.println("We are walking here: " + place);
        var = 10;
    }

    public void sleep() {

        System.out.println("ZzzzZZzzzZZZzZz");
    }

    public void sound() {
        System.out.println("Hi!");
    }

}
