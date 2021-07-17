package mypackage1;

public class Cat extends Animals {

    public void feed(String feed) {

        System.out.println("I'm eating: " + feed);
    }

    @Override   // переопределение метода. Используется для класса где переопределён, для всех остальных - по умолчанию.
    public void sound() {
        System.out.println("Mew, mew, meeeew!");
    }
}
