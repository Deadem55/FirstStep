package mypackage1;

public class Dog extends Animals {          // <объявление текущего класса> extends <наименование класса от которого наследуется>

    private int weight = 2;

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void sit() {

        System.out.println("I'm sitting.");
        var = 20;
    }

    public void lay() {

        System.out.println("I'm laying");
    }

}
