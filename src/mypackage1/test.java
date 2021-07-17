package mypackage1;

public class test {
    public static void main(String[] args) {
        System.out.println("Start of program: ");
        int i = 4;
        boolean bool = true;
        while (bool) {
            if (i >= 5) {
                bool = false;
            } else {
                System.out.println("While bool:" + i);
                i++;
            }
        }
        System.out.println("End of program.");
        System.out.println();

        System.out.println("Start of program 2: ");
        i = 5;
        do {
            System.out.println("Do: " + i);
            i++;
        } while (i < 5);
        System.out.println("End of program 2.");
    }
}
