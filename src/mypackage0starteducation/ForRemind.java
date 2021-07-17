package mypackage0starteducation;

public class ForRemind {

    public static void main(String[] args) {

        int age = 18;
        String name = "PersonName";

        System.out.println(name + " " + age + " age");
        System.out.println();

        float a = 1.1234567f;
        double b = 1.12345678;
        boolean c = a > b;
        boolean d = a < b;

        System.out.println(a + " = a, " + b + " = b.");
        System.out.println();
        System.out.println(c + " a > b");
        System.out.println(d + " a < b");
        System.out.println();

        String[] nameMassive = {"ElementMassive1", "ElementMassive2", "ElementMassive3"};

        String[] result = new String[3];
        result[0] = "Result 1";
        result[1] = "Result 2";
        result[2] = "Result 3";

        System.out.println(result[2]);
        System.out.println();

        int[] numberMassive = new int[10];

        for (int i = 0; i < 10; i++) {
            numberMassive[i] = i * 10;

        }

        System.out.println(numberMassive[4]);
        System.out.println();

        for (int j = 0; j < 10; j++) {
            if (j + 1 > nameMassive.length) {break;}
            System.out.println(nameMassive[j] + " " + numberMassive[j] + " " + result[j]);

        }

    }

}
