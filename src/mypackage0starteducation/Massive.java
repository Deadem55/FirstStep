package mypackage0starteducation;

public class Massive {

    public static void main(String[] args) {

        String[] names; // Объявление массива для хранения переменных Имён
        names = new String[3]; //Выделение памяти для массива Имён

        String[] name = new String[3]; //Объявление и выделение памяти для массива разом
        int[] age = new int[10]; // Объявление и выделения памяти для переменных хранения информации возраста

        name[0] = "Vasya";  //Инициализация
        name[1] = "Petya";
        name[2] = "Sasha";

        System.out.println(name[0]);
        System.out.println();

        age[0] = 10;
        System.out.println(age[0]);
        System.out.println();

        age[0] = 18;
        System.out.println(age[0]);
        System.out.println();

        age[0] = 23;
        age[0] = 27;
        System.out.println(age[0]);
        System.out.println();

        int[] age2 = {13, 18, 27};
        System.out.println(age2[0]);
        System.out.println(age2[1]);
        System.out.println(age2[2]);
        System.out.println();

        for (int i = 0; i < 3; i++) {   // объявление цикла для вывода строчек по переменной инт, чтоб не писать каждую отдельно
            System.out.println(name[i] + " " + age2[i] + " " + "age");
        }  //между объявлением и телом цикла ОТСУТСТВУЮТ ТОЧКА С ЗАПЯТОЙ И ТЕЛО БЕРЁТСЯ В ФИГУРНЫЕ СКОБКИ

        System.out.println();
        int[] age3 = new int[15];

        for (int j = 0; j < 15; j++) {
            age3 [j] = j * 10;
            System.out.println(age3[j]);
        }

        //age3.length - размер массива
        System.out.println();
        System.out.println(age3.length);

        System.out.println();
        System.out.println(age3[age3.length - 1]);
        System.out.println();

        for (int k = 0; k < age3.length; k++) {
            if (k + 1 > name.length) { break; }
            System.out.println(name[k] + " " + age3[k] + " " + "age");
        }

    }
}
