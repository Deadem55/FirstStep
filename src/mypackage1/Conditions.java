package mypackage1;

public class Conditions {

    public static void main(String[] args) {

        System.out.println("Start of program");
//        условие if
        System.out.println("условие if:");
        int i = 5;
        if (i > 5) {
            System.out.println("i > 5");    // if (условие) {команда при true для условия}
            i++;
            System.out.println(i);
        }
        else {
            System.out.println("i <= 5");
            i--;
            System.out.println(i);
        }
        System.out.println("End of program");
        System.out.println();

//        двойное условие
        System.out.println("Start of program 2 (вложенное если в альтернативную ветку условия):");
        i = 4;
        if (i > 10) {
            System.out.println("i > 10");
            i++;
            System.out.println(i);
        }
        else if (i < 10 && i > 5){
            System.out.println("i < 10 and i > 5");
            i--;
            System.out.println(i);
        }
        else {
            System.out.println("nothing");
        }
        System.out.println("End of program 2.");
        System.out.println();

        System.out.println("Start of program 3 (вложенное условие в основную ветку условия):");
        i = 90;
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
        System.out.println("End of program 3.");
        System.out.println();

//        оператор множественного выбора
        i = 3;
        System.out.println("оператор множественного выбора switch:");
        switch (i) {
            case 1:
                System.out.println("Then number is 1");
                break;
            case 2:
                System.out.println("Then number is 2");
                break;
            case 3:
                System.out.println("Then number is 3");
                break;
            default:
                System.out.println("I don't know the number");
        }

    }
}
