package mypackage0starteducation;

public class ConditionsETC {

    public static void main(String[] args) {

        //условие

        int i = 3;

        System.out.println("Start of program Условие");

        if (i > 10) {  // если (условие) {действие при выполнении условия}
            System.out.println("i > 10");
            i++;
            System.out.println(i);
        }
        else { // иначе {действие если условие не выполненно}. Без фигурных скобок выполняетс только одна команда, остальное вне конструкции условия
            System.out.println("1 <= 10");
            i--;
            System.out.println(i);
        }

        System.out.println("End of program Условие");

        //расширенние условия если

        System.out.println();
        int i2 = 10;

        System.out.println("Start of program Вложенное если");

        if (i2 > 10) {
            System.out.println("i2 > 10");
            i2++;   //инкремент, инкрементирование
            System.out.println(i2);
        }
        else if (i2 < 10 && i2 > 5) {
            System.out.println("i2 < 10 and i2 > 5");
            i2--;   //дикремент, дикрементирование
            System.out.println(i2);
        }
        else {
            System.out.println("Nothing");
        }

        System.out.println("End of program Вложенное если");

        //вложенное условие

        System.out.println();
        System.out.println("Start of program вложенное условие");

        i = 95;
        if (i > 50) {
            System.out.println("i > 50");
            if (i > 90) {
                System.out.println("i > 90");
            }
            else {
                System.out.println("i <= 90");
            }
        }
        else {
            System.out.println("i <= 50");
        }

        System.out.println("End of program Вложенное услоеие");

        //Оператор множественного выбора (проверяется не условия, равенство на конкретное значение)

        System.out.println();

        System.out.println("Start of program Сравнение");

        i = 4;
        switch (i) { // оператор (переменная для сравнения)
            case 1: // если переменная = 1
                System.out.println("Then number is 1");
                break;
            case 2: // если переменная = 2
                System.out.println("Then number is 2");
                break;
            case 3: // если переменная = 3
                System.out.println("Then number is 3");
                break;
            default: // если значения из кейсов не подошло, выполнять это действие (не обязательный оператор для свича)
                System.out.println("I don't know the number");
                break;
        }

        System.out.println("End of program Сравнение");

    }

}
