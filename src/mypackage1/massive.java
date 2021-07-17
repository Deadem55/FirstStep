package mypackage1;

public class massive {

    public static void main(String[] args) {

        String[] names;
        names = new String[3];

        String[] name = new String[3];
        int[] arr = new int[10];

        name[0] = "Имя 1";
        name[1] = "Имя 2";
        name[2] = "Имя 3";

        System.out.println(name[0]);
        System.out.println(name[2]);
        System.out.println();

        arr[3] = 15;
        arr[3] = 10;
        System.out.println(arr[3]);

        int[] array = {15, 10, 100, 9, 44};

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println();

        System.out.println("Цикл заполнения массива:");
        for (int i = 0; i < 5; i++) {
            System.out.println(array[i]);
        }
        System.out.println();

        System.out.println("Цикл заполнения массива и вывод значения элемента:");
        int[] arr2 = new int[15];

        for (int j = 0; j < 15; j++) {
            arr2[j] = j * 10;
            System.out.println(arr2[j]);
        }
        System.out.println();

        System.out.println("вывод размера массива:");
        System.out.println(arr2.length); // размер массива
        System.out.println();

        System.out.println("вывод n-ого элемента массива (в данном примере последнего):");
        System.out.println(arr2[arr2.length -1]);

    }

}
