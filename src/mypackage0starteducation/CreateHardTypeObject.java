package mypackage0starteducation;

public class CreateHardTypeObject {
    public static void main (String[] args) {
        Person person = new Person ();
    }

    public static class Person {
        String name;
        int age;
        int weight;
        int money;
    }

    public static void family (String[] args) {
        Man man = new Man (); //Создали объект Man, занесли его ссылку в переменную Man.  равен null.
        Woman woman = new Woman ();
        man.wife = woman;
        woman.husband = man;
    }

    public static class Man {  //объявление нового сложного типа
        public int age2; //переменные нового сложного типа
        public int height2;
        public Woman wife;
    }

    public static class Woman {
        public int age3;
        public int height3;
        public Man husband;
    }
}
