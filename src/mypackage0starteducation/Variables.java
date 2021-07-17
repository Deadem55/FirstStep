package mypackage0starteducation;

public class Variables {

    public static void main(String[] args) {

        //целочисленные

        byte a = 5; // -128 127
        short b = -100; // -32768 32767
        int c;
        c =  1000000;
        long d = -122335544;

        System.out.println(a);
        System.out.println("short b: " + b);
        System.out.println("int c: " + c);
        System.out.println("long d: " + d);

        //вещественные

        double double1 = 135.155;
        System.out.println();
        System.out.println("double double1: " + double1);
        float float1 = 150.32f;
        System.out.println("float float1: " + float1);

        //условный тип

        boolean boolean1 = true;
        boolean boolean2 = false;
        System.out.println(boolean1);
        System.out.println(boolean2);

        boolean boolean3 = 1 + 2 > 0;
        boolean boolean4 = 1 + 2 > 5;
        System.out.println();
        System.out.println(boolean3);
        System.out.println(boolean4);

        //строковые значения

        String str = "Hello";
        String str2 = "World!";
        String str3 = str + " " + str2;
        System.out.println();
        System.out.println(str3);

        char char1 = 'q';
        System.out.println(char1);

        String personName;
        int age;

        a = 5;
        System.out.println(999);
        System.out.println(Math.pow(a, 2));

    }
}
