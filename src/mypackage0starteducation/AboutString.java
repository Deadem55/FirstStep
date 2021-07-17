package mypackage0starteducation;

public class AboutString {

    public static void main (String[] args) {

        //Сравнение переменных типа String

        String s;
        // s == "Hello";  не работает для типа строк String, так как таким методом сравниваются ссылки на объекты

        s = "Hello World!";
        System.out.println(s.equals("Hello World!"));
        System.out.println(s.equals("Hello!"));

        String s2 = "Hello";

        System.out.println(s.equals(s2));

        s = "text";
        s2 = "TEXT";
        System.out.println(s.equals(s2));
        System.out.println(s.equalsIgnoreCase(s2));

        //Работа с переменной типа String (регистр, работа с н-ым символом строки)

        s = "TeXt";
        System.out.println();
        System.out.println(s);
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());

        System.out.println();
        System.out.println(s.charAt(2)); // получить н-ый символ строки
        System.out.println(s.indexOf("Xt"));  // получить индекс вхождения указанной части строки (смотрится на какой позиции находится первый из указанных символов. Нумерация как и в массивах - с нуля)

        s = "Hello, World!";
        System.out.println(s.contains("Hello")); // Содержит ли указанная переменная строку указанную после команды contains. Возвращает булеан
        System.out.println(s.contains("text"));
        System.out.println(s.length());

        System.out.println();
        System.out.println(s.startsWith("He") + " Начинается на He"); //startsWith - начинается ли строка на указанную после команды строку. Возвращает булеан
        System.out.println(s.startsWith("!") + " Начинается на !");
        System.out.println(s.endsWith("He") + " Заканчивается на He"); //endWith - заканчивается ли строка на указанную после команды строку. Возвращает булеан
        System.out.println(s.endsWith("!") + " Заканчивается на !");

        s ="hello,world";
        System.out.println();
        String[] array = s.split(","); // разделить строку на массив с н-ым количеством элементов используя в качестве разделителя значение после команды split
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[0] + "!" + array[1] + "!");

        String str = "My name is %s! I'm %d years old!"; // %s (String) - означает что сюда в дальнейшем будет вставлена строка, %d (double) - число
        int age = 30;
        String name = "Ivan";
        System.out.println(String.format(str, name, age)); // вывести шаблон str с указанными переменными в качестве значений %
        System.out.println(String.format(str, "Vasya", 10));

        System.out.println();
        String age2 = "30";
        int a = Integer.parseInt(age2); //преобразовать строку указанную после команды в число
        System.out.println(a * 3);

        s = "Hello, World!";
        System.out.println(s.substring(1, 5)); //получить подстроку строки (от указанного до указанного индекса
        System.out.println(s.substring(7));

        System.out.println(s.substring(7, s.length() - 2)); // получить подстроку от 7 индекса до (длины строки - 2)

        // объединение строк (лучшая оптимизация по сравнению со сложением)

        String s1 = "Hello ";
        s2 = "world";
        String s3 = "!";
        String res;

        res = s1 + s2 + s3;
        System.out.println(res);

        res = s1.concat(s2).concat(s3);
        System.out.println(res);

    }

}
