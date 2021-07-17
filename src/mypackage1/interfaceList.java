package mypackage1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class interfaceList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();     // ИнтерфейсЛист<Класс объектов хранимый в коллекции> наименование = new реализацияЛиста. Менее оптимизирован что-бы добавлять новые значения (перезаписывает индекс всех затронутых значений)
        List<Integer> linkedList = new LinkedList<>();     // ИнтерфейсЛист<Класс объектов хранимый в коллекции> наименование = new реализацияЛиста. Менее оптимизирован что-бы вытягивать значения (перебирвает все до заданного)
        list.add(5); // добавление нового элемента в массив коллекции лист
        list.add(10);
        list.add(9);
        System.out.println();

        System.out.println("получение значения элемента из списка по его инексу");
        int a = list.get(2);    // получить значение по индексу
        System.out.println(list.get(1));
        System.out.println("a = " + a);
        System.out.println();

        System.out.println("установка нового значения для элемента по его индексу из списка:");
        list.set(2, 100);   // установить значение(индекс, значение)
        System.out.println(list.get(2));
        System.out.println();

        System.out.println("удаление второго элемента из списка:");
        System.out.println(list.get(1));
        list.remove(1);     // удалить элемент из списка
        System.out.println(list.get(1));
        System.out.println();

        System.out.println("вывод размера списка из коллекции:");
        System.out.println(list.size());    // вывод размера списка
        list.add(15);
        System.out.println(list.size());
        System.out.println();

        System.out.println(list.size());
//        list.clear();   //очистить список
        System.out.println(list.size());
        System.out.println();

//        операции по двум и более листам
        System.out.println("Объединение листов (лист 2 добавляется к листу 1)");
        List<Integer> list2 = new ArrayList<>();
        list2.add(45);
        list2.add(56);
        System.out.println(list.size());
        list.addAll(list2);     // к list(n).добавить(лист(m))
        System.out.println(list.size());
        System.out.println();

        System.out.println("Удаление элементов одного списка из другого:");
        System.out.println(list.size());
        list.removeAll(list2);      //из list(n).удалить(list(m))
        System.out.println(list.size());
        System.out.println();

        System.out.println("пустой ли список list: ");
        System.out.println(list.isEmpty());     // булево - проверяет пустой ли список
//        list.clear();
        System.out.println(list.isEmpty());
        System.out.println();

//        содержит ли список запрашиваемый объект
        System.out.println("Содержит ли список запрашиваемый объект: ");
        System.out.println(list.contains(100));     // содержит ли list.(запрашиваемое значение)
        System.out.println(list.contains(987));
        System.out.println();

        System.out.println("существуют ли все элементы второго списка в первом: ");
        list.addAll(list2);     // второй список добавляется к первому
        System.out.println(list.containsAll(list2));
        list.removeAll(list2);
        System.out.println(list.containsAll(list2));
        System.out.println();

    }
}
