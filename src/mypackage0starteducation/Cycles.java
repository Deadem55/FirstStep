package mypackage0starteducation;

public class Cycles {

    public static void main(String[] args) {

        System.out.println("Start program Цикл For");

        for (int i = 0; i < 10; i++) {   // оператор (создание счётчика; условие для выполнения цикла; действие счётчика до условия)
            System.out.println(i * 10);
        }

        System.out.println("End of program Цикл For");
        System.out.println();

        System.out.println("Start program For decriment");

        for (int i = 10; i >0; i--) {
            System.out.println(i);
        }

        System.out.println("End program For decriment");

        //Заполнение массива с помощью цикла

        System.out.println();
        System.out.println("Start program Заполнение массива");

        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {  //цикл заполнения массива с нулевого элемента до 10ого
            array[i] = i * 2;
        }
        for (int i = 0; i < 10; i++) {  // цикл для вывода итого элемента
            System.out.println("Element with index " + i + " is " + array[i]);
        }

        System.out.println("End of program Заполнение массива");

        // Цикл "для каждого"

        System.out.println();
        System.out.println("Start of program For each");

        for (int element : array) {  // для ( новое имя счётчика : из массива)
            System.out.println(element);
        }

        System.out.println("End of program For each");

        // Цикл "Пока"

        System.out.println();
        System.out.println("Start of program While");

        int i = 0;
        while (i < 10) { //оператор пока (условие) {выполнять тело цикла}
            System.out.println("While: " + i);
            i++;
        }

        System.out.println("End of program While");

        System.out.println();
        System.out.println("Start of program While bool");

        i = 0;
        boolean bool = true;
        while (bool) {
            System.out.println("While: " + i);
            i++;
            if (i == 5) bool = false;
        }

        System.out.println("End of program While bool");

        // цикл "Делать до тех пор"

        System.out.println();
        System.out.println("Start of program Do while");

        System.out.println("While");
        i = 5;
        bool = true;
        if (i >= 5) bool = false;
        while (bool) {
                System.out.println("While: " + i);
                i++;
                //if (i == 5) bool = false;
        }

        i = 5;
        System.out.println("Do while");
        do {
            System.out.println("Do: " + i);
            i++;
        } while (i < 5);

        System.out.println("End of program Do while"); 

    }

}
