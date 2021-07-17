package mypackage1;

public class method {
    public static void main(String[] args) {
        int a = 13;
        int b = 3;
        int summary;
        summary = getSum(a, b);
        System.out.println(summary);
        summary = getSum(10, 150);
        System.out.println(summary);
        summary = getSum(2, 11);
        System.out.println(summary);
        System.out.println();

        showSum(10,51,77);
        System.out.println();

        saySmth();
        System.out.println();

        sayHello("Anybody");
        System.out.println();
        String name = "Trol'";
        sayHello(name);
        System.out.println();

        showSumToPerson("Something name", 11,15,23);
        System.out.println();

        boolean result = bool(1,22,333);
        System.out.println(result);

//        перегрузка методов
        System.out.println("Здесь перегрузка методов:");
        int result2 = getSum(1,10);
        System.out.println(result2);
        result2 = getSum(1,10,23);
        System.out.println(result2);
        System.out.println();

        sayHello("Petr");
        System.out.println();
        sayHello("Ivan", "Elena");
        System.out.println();
        sayHello();
        System.out.println();

        int[] array = {1, 22, 52, 34, 16};
        int sum = getSum(array, "Something name");
        System.out.println(sum + 100);

    }
    static int getSum(int x, int y) {
        int sum = x + y;
        return sum;     //значение возвращаемое методом
    }

    //    перегрузка методов
    static int getSum(int x, int y, int z) {
        int sum = x + y + z;
        return sum;
    }

    static int getSum(int[] array, String name) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("Hi " + name + "!");
        System.out.println("Your sum is: " + sum);
        return sum;
    }

    static void showSum (int x, int y, int z) {     //void не возвращает ничего
        int summary = x + y + z;
        System.out.println("Summary is: " + summary);
    }

    static void saySmth() {
        System.out.println("Something!");
        System.out.println("-Nothing-");
        System.out.println("!Everything!");
    }

    static void sayHello(String name) {
        System.out.println("Hello " + name + "!");
        System.out.println("what's going on?");
        System.out.println("I'm your program.");
    }
    static void sayHello(String name, String name2) {
        System.out.println("Hello " + name + "!");
        System.out.println("Hello " + name2 + "!");
        System.out.println("what's going on?");
        System.out.println("I'm your program.");
    }
    static void sayHello() {
        System.out.println("Hello");
        System.out.println("what's going on?");
        System.out.println("I'm your program.");
    }

    static void showSumToPerson(String name, int a, int b, int c) {
        System.out.println("Start to program");
        sayHello(name);
        showSum(a, b, c);
        System.out.println("End of program");
    }

    static boolean bool (int x, int y, int z) {
        int summary = x + y + z;
        System.out.println("Summary is: " + summary);
        return true;
    }

}
