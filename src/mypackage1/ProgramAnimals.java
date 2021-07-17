package mypackage1;

public class ProgramAnimals {
    public static void main(String[] args) {

        Cat cat = new Cat();
        Dog dog = new Dog();

        cat.name = "Osiris";
        dog.name = "Ra";

        cat.color = "Yellow";
        dog.color = "Gold";
        System.out.println("Hey, master. I'm your cat. " + "My name is: " + cat.name);
        System.out.println("Nice to meet you! =(^_^)=)");
        cat.walk("Backyard");
        cat.feed("Milk");
        System.out.println();
        System.out.println("Hey, master. I'm your dog." + "My name is: " + dog.name);
        System.out.println("Nice to meet you! =(^,..,^)=");
        dog.walk("Park");
        System.out.println();

        System.out.println(dog.getWeight());    // Использование get-ера
        System.out.println();

        dog.sound();
        cat.sound();

        dog.var = 10;
        System.out.println();

        DogForAbstraction dog2 = new DogForAbstraction();
        CatForAbstraction cat2 = new CatForAbstraction();

        System.out.println("Использование абстрактных классов и методов:");
        dog2.saySmth1();
        dog2.walk1("City");
        dog2.sit1();
        System.out.println();
        cat2.saySmth1();
        cat2.walk1("street");
        cat2.eat1();
    }


}
