package mypackage1;

public class LogicalOperation {

    public static void main(String[] args) {

        int a;
        a = 10;
        a = 20;
        System.out.println("a = " + a);
        System.out.println();

        int b = a;
        System.out.println("b = " + b);
        System.out.println();

        int c, d;
        c = d = b;
        System.out.println(c + " " + d);
        System.out.println();

//        простые арифметические операции

        System.out.println("простые арифметические операции:");
        a = 13;
        b = 5;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);  //так как переменные типа int (целые числа) - в ответе получаем тоже целое число типа int. Чтоб получить по факту - необходимо указать тип переменных double
        System.out.println();

        double e = 15;
        double f = 7;
        System.out.println( e / f);
        System.out.println();

//        получение остатка от деления

        System.out.println("получение остатка от деления:");
        System.out.println(a % b);
        System.out.println();

        a = (b + c) * d;
        System.out.println(a);
        System.out.println();

        a = 15;
        b = 10;
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a - 5 >= b);
        System.out.println(a - 5 <= b);
        System.out.println(a == b);
        System.out.println( a!= b);
        System.out.println(a + 10 <= b + 15);
        System.out.println(!(a + 10 <= b + 15));    // операция отрицания
        System.out.println(!(false));
        System.out.println();

//        инкремент, декремент
        System.out.println("инкремент:");
        int i = 0;
        i++;        // i = i + 1; постфиксная
        System.out.println(i);
        System.out.println();

        System.out.println("декремент:");
        i--;        // i = i - 1; постфиксная
        System.out.println(i);
        System.out.println();

        System.out.println("постфиксная операция инкремента:");
        i = 5;
        System.out.println(i++);
        System.out.println(i);
        System.out.println();

        System.out.println("префиксная операция инкремента:");
        i = 3;
        a = i++;
        System.out.println(a);
        i = 3;
        a = ++i;
        System.out.println(a);
        System.out.println();

//        операции булиановского типа

        a = 10;
        b = 20;
        System.out.println(a > b || a < b);     // либо а больше чем б, либо а меньше чем б. Если истина хоть одно - всё выражение = истина
        System.out.println(a > b || b > 30);

        System.out.println(a > b && a < b);     //если а > b и a < b - только тогда = Истина
        System.out.println(a > 9 && b == 20);
        System.out.println();

        System.out.println(!(a + 10 > 15 || b - 5  > 10 && a < b));        // приоритет: 1. (a + 10 > 15 = true); 2. (b - 5 > 10 = true); 3. (a < b = true); 4. &&; 5. ||. Итог = true
        System.out.println((a + 10 > 15 || b - 5  > 10) && a < b);
        System.out.println();

        a = 9;
        System.out.println(Math.sqrt(a));
        System.out.println(Math.pow(a, 3));
        System.out.println();

        a = 10;
        a = a + 5;
        System.out.println(a);
        System.out.println();

        a = 10;
        a += 5; // a = a + 5
        System.out.println(a);
        a -= 5;
        System.out.println(a);
        a *= 2;
        System.out.println(a);
        a /= 2;
        System.out.println(a);
        a %= 3;  // a = a % 3
        System.out.println(a);

    }
}
