package mypackage1;

public class VariableType {
    public static void main(String[] args) {

//  типы целых чисел
        System.out.println("Типы целых чисел:");
        byte a = 5; // -128 127
        short b = -100; // -32768 32767
        int c;  //
        c = 1000000;
        long d = -1223355544;

        System.out.println(a);
        System.out.println("short b: " + b);
        System.out.println("int c: " + c);
        System.out.println("long d: " + d);
        System.out.println();

//  типы вещественных чисел
        System.out.println("типы вещественных чисел:");
        double double1 = 133.155;
        System.out.println("double double 1: " + double1);
        float float1 = 150.32f;     // хранит меньшее знаение чем double
        System.out.println("float float1: " + float1);
        System.out.println();

        System.out.println("Boolean тип:");
        boolean bool1 = true;
        boolean bool2 = false;

        System.out.println("bool1: " + bool1);
        System.out.println("bool2: " + bool2);
        System.out.println();

        boolean bool3 = 1 + 2 > 0;
        boolean bool4 = 1 + 2 > 5;

        System.out.println("bool3: " + bool3);
        System.out.println("bool4: " + bool4);
        System.out.println();

        System.out.println("Строка:");
        String str1 = "Строка переменной string (1)";
        String str2 = "+ Строка переменной string (2)";
        String str3 = str1 + " " + str2;
        System.out.println(str3);
        System.out.println();

        char char1 = 'q';
        System.out.println(char1);
        System.out.println();

        String personName;
        int age;

    }
}
