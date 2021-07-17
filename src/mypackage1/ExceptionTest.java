package mypackage1;

public class ExceptionTest {
    public static void main(String[] args) {
//     !!!выяснить почему выполняется в самом конце, а не как прописан первым!!!
        System.out.println("Блок по методу 3 (Exception3): ");
        try {
            exception3(10, 0);
        } catch (ArithmeticException e) {
            System.out.println("123 " + e.getMessage());

            e.printStackTrace();
        }
            finally {
            System.out.println("Finish exception 3.1");
        }
        System.out.println();

        System.out.println("А теперь без исключения:");
        try {
            exception3(10, 2);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
}

    public static void exception3(int a, int b) /*throws ArithmeticException*/ {
        if (b == 0) {
            throw new ArithmeticException("Can't devide by zero");
        } else {
            System.out.println("Result is: " + a / b);
        }
    }
}
