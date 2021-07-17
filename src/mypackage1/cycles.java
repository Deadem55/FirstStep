package mypackage1;

public class cycles {
    public static void main(String[] args) {
//        цикл for
        System.out.println("Start of program (Cycles for):");
        for ( int i = 0; i < 10; i++) {
            System.out.println(i * 10);
        }
        System.out.println("End of program.");
        System.out.println();

        System.out.println("Start of program 2:");
        for ( int i =10; i > 0; i--) {
            System.out.println(i);
        }
        System.out.println("End of program 2.");
        System.out.println();

//        цикл в массивах
        System.out.println("Start of program 3 (cycles in the massive):");
        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = i * 2;
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("Element with index " + i + " " + "is: " + array[i]);
        }
        System.out.println("End of program 3.");
        System.out.println();

//        цикл для каждого (for each)
        System.out.println("Start of program 4 (for each): ");
        for (int counterName: array) {
            System.out.println(counterName);
        }
        System.out.println("End of program 4.");
        System.out.println();

//        цикл до тех пор (while)
        System.out.println("Start of program 5 (while): ");
        int i = 0;
        while (i < 10) {
            System.out.println("While:" + i);
            i++;
        }
        System.out.println("End of program 5.");
        System.out.println();

        System.out.println("Start of program 6: ");
        i = 0;
        boolean bool = true;
        while (bool) {
            System.out.println("While bool:" + i);
            i++;
            if (i == 5) bool = false;
        }
        System.out.println("End of program 6.");
        System.out.println();

//        do while
        System.out.println("Start of program 7: ");
        i = 5;
        do {
            System.out.println("Do: " + i);
            i++;
        } while (i < 5);
        System.out.println("End of program 7.");
        System.out.println();

    }
}
