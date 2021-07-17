package mypackage0starteducation;

public class LogicalOperationInMath {
    public static void main(String[] args) {

        System.out.println("Операции присваивания");
        int a;
        a = 10;
        a = 20;
        System.out.println(a);

        int b = a;
        System.out.println(b);

        int c, d;
        c = d = b;

        System.out.println(c + " " + d);

        System.out.println();
        System.out.println("Простые арифметические операции");

        a = 13;
        b = 5;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        double e = 15;
        double f = 7;
        System.out.println();
        System.out.println(e / f);
        System.out.println(a % b); // получить остаток от деления
        System.out.println();

        a = b + c * d;
        System.out.println(a);

        System.out.println();
        System.out.println("Операции сравнения");

        a = 15;
        b = 10;

        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a - 5 >= b);
        System.out.println(a - 5 <= b);
        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println(a + 10 <= b + 15);
        System.out.println(!(a + 10 <= b + 15));
        System.out.println(!(false));

        System.out.println();
        System.out.println("Инкримент, дикремент");

        int i = 0;
        i++; //инкримент
        System.out.println(i);
        i--; //декримент
        System.out.println(i);

        i = 5;
        System.out.println(i++);
        System.out.println(i);

        i = 3;
        a = i++;
        System.out.println(a);
        i = 3;
        a = ++i;
        System.out.println(a);

        System.out.println();
        System.out.println("Операции булиановского типа");

        a = 10;
        b = 20;

        System.out.println(a > b || a < b); // логическое "или". Если хоть одно из значений истина = тогда всё выражение истина
        System.out.println(a > b || b > 30);
        System.out.println();
        System.out.println(a > b && a < b); // логическое "и". Всё выражение истина только тогда когда все значения = Истина
        System.out.println(a > 9 && b == 20);

        System.out.println();
        System.out.println(!(a + 10 > 15 || b - 5 > 10 && a < b)); // порядок выполннения действий = сперва "и = &&" , затем "или = ||"

        System.out.println();
        System.out.println("Использование класса математических функций");

        a = 9;
        System.out.println(Math.sqrt(a));
        System.out.println(Math.pow(a, 3));

        System.out.println();
        System.out.println("Комбинированные записи");

        a = 10;
        a = a + 5;
        System.out.println(a);

        a = 10;
        a += 5;
        System.out.println(a);
        a -= 5;
        System.out.println(a);
        a *= 2;
        System.out.println(a);
        a /= 2;
        System.out.println(a);
        a %= 3;
        System.out.println(a);

    }
}
