package mypackage0starteducation;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionList {
    public static void main(String[] args) {
//создание интерфейс список <тип переменных> имя = тип списка
        List<Integer> list = new ArrayList<>();
//добавление новых элементов в список
        list.add(5);
        list.add(10);
        list.add(9);
//get - получить указаннный элемент списка
        int a = list.get(2);

        System.out.println(list.get(1));
        System.out.println(list.get(0));
        System.out.println(a);
        System.out.println();
// установить (энному элементу списка, значение)
        list.set(2, 100);
        System.out.println(list.get(2));
        System.out.println();
//удалить (номер элемента) из списка
        System.out.println(list.get(1));
        list.remove(1);
        System.out.println(list.get(1));
        System.out.println();

//текущий размер списка (количество элементов хранящихся в списке)
        System.out.println(list.size());
        list.add(9);
        System.out.println(list.size());
        System.out.println();
//очистить интерфейс списка
       // list.clear();
        System.out.println(list.size());

        List<Integer> list2 = new ArrayList<>();
        list2.add(45);
        list2.add(50);
//добавить в интерфейс списка.все элементы (указанного интерфейса списка)
        System.out.println(list.size());
        list.addAll(list2);
        System.out.println(list.size());
//удалить из интерфейсаСписка.все элементы(указанного интерфейса списка)
        list.removeAll(list2);
        System.out.println(list.size());
//пустая ли интерфейс списка? Истина или Ложь
        System.out.println(list.isEmpty());
      //  list.clear();
        System.out.println(list.isEmpty());
        System.out.println();
//содержит ли интерфейс списка(указанное значение)
        System.out.println(list.contains(100));
        System.out.println(list.contains(987));
        System.out.println();
//содержит ли интерфейс списка все значения (из указанного интерфейса списка)
        list.addAll(list2);
        System.out.println(list.containsAll(list2));

        list.removeAll(list2);
        System.out.println(list.containsAll(list2));
        System.out.println();
//вывести следующий элемент списка
        Iterator<Integer> iterator = list.iterator(); // объявление итератора. Начинается всегда перед первым (нулевым) элементом списка. То-есть изначально ничего
        System.out.println(iterator.next());
        System.out.println(iterator.next());
/* //содержит ли список следущий элемент
        System.out.println(iterator.hasNext());
        System.out.println();  */

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
