package mypackage1;

public class AboutString {

    public static void main(String[] args) {

        String s;

//        строка содержит значение
        System.out.println("строка содержит указанное значение:");
        s = "Сравниваемое значение";
        System.out.println(s.equals("Сравниваемое значение"));
        System.out.println(s.equals("Сравниваемое"));
        System.out.println();

        String s2 = "значение";
        System.out.println(s.equals(s2));
        s = "text";
        s2 = "TeXt";
        System.out.println(s.equals(s2));
        System.out.println(s.equalsIgnoreCase(s2));  // строка содержит значение, игнорирует регистр
        System.out.println();

//        изменение регистра строки
        System.out.println("изменение регистра строки:");
        s = "TeXtZ";
        System.out.println(s);
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());
        System.out.println();

//        поиск значений и индекса значений строки
        System.out.println("поиск значений строки и индекса значения");
        System.out.println(s.charAt(0));        // поиск текста по индексу
        System.out.println(s.charAt(2));
        System.out.println(s.charAt(4));
        System.out.println(s.indexOf("Xt"));        // поиск индекса строки в переменной (указывается с нуля до первого символа указанной строки)
        System.out.println();

//        содержит ли строка указанное значение
        System.out.println("содержит ли строка указанное значение:");
        System.out.println("Строка s содержит значение:");
        s = "Hello, World!";
        System.out.println(s.contains("Hello"));    // строка. содержит значение
        System.out.println(s.contains("NotFound"));
        System.out.println(s.length());     //длина строки
        System.out.println();

//        начинается или заканчивается ли строка указанным значением
        System.out.println("начинается или заканчивается ли строк указанным значением");
        System.out.println(s.startsWith("He"));
        System.out.println(s.startsWith("!"));
        System.out.println(s.endsWith("He"));
        System.out.println(s.endsWith("!"));
        System.out.println();

//        разбиение строки по разделителю на несколько
        System.out.println("разбиение строки по разделителю на несколько:");
        s = "hello,world";

        String[] array = s.split(",");
        System.out.println(array[0] + "!" + array[1] + "!");
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println();

//         Форматирование строки
        System.out.println("метод для форматирования строки:");
        String str = "My name is %s! I'm %d year old";  // %s - формат строки (String), %d - числовой формат (double?)
        int age = 30;
        String name = "Ivan";

        System.out.println(String.format(str, name, age));
        System.out.println(String.format(str, "Vanya", 11));
        System.out.println();

//        преобразование String в int (числовой тип)
        System.out.println("преобразование строки в числовой тип:");
        String age2 = "30";
        int a = Integer.parseInt(age2);
        System.out.println(a * 3);
        System.out.println();

//        вывод подстроки из строки
        System.out.println("вывод подстроки из строки:");
        s = "Hello, world!";
        System.out.println(s.substring(1, 5));  //указывается индекс начала и конца подстроки которую хотим выделить (индекс стандартно с нуля - первый символ)
        System.out.println(s.substring(7)); //обрезается от указанного значения и до конца строки
        System.out.println();

        System.out.println("вывод подстроки от индекса до индекса вычесленного от длины строки:");
        System.out.println(s.substring(7, s.length() - 2));
        System.out.println();

//        конкатенация строк (слияние)
        System.out.println("слияние, конкатенация строк:");

        System.out.println("стандартный способ через сложение:");
        String s1 = "Hello ";
        s2 = "world";
        String s3 = "!";
        String res;
        res = s1 + s2 + s3;
        System.out.println(res);

        System.out.println("конкатенация (лучшая оптимизация):");
        res = s1.concat(s2).concat(s3); // работает более оптимизированно чем через сложение. Через .concat можно подсоединять дальше множество строк
        System.out.println(res);
        System.out.println();

        s1 = new String("Hello ");
        String test = new String("Hello ");
        System.out.println("reference " + (s1 == test));
        Boolean aaaa = s1.equals(test);
    }

}
