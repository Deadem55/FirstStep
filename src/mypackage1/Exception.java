package mypackage1;

public class Exception {
    public static void main(String[] args) {

        devide(10, 2);
        System.out.println();
        System.out.println("А теперь исключение: ");
        devide(10, 0);
        System.out.println();

        System.out.println("Блок по методу 2 (Exception2): ");
        exception2(10, 2);
        System.out.println();
        System.out.println("А теперь исключение: ");
        exception2(10, 0);
        System.out.println();

        System.out.println("Блок по методу 3 (Exception3): ");
        try {
            exception3(10, 2);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }

    }

    public static void devide(int a, int b) {
        try {
            System.out.println("Result is: " + a/b);        //основное действие метода которое выполняем
        } catch (ArithmeticException e) {       // Условие при ошибке/исключении
            System.out.println("Houston, we have a problem!");;     // Действие при ошибке/исключении
        }
            finally {
            System.out.println("Finish him");
        }
    }

    public static void exception2(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Can't devide by zero");
        }
        else {
            System.out.println("Result is: " + a / b);
        }

    }

    public static void exception3(int a, int b) throws ArithmeticException {  // выводит ошибку по исключению если не используется try/catch для не RuntimeException
        if (b == 0) {
            throw new ArithmeticException("Can't devide by zero");
        }
        else {
            System.out.println("Result is: " + a / b);
        }
    }

}
