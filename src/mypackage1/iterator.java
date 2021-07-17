package mypackage1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class iterator {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(15);
        list.add(20);
        list.add(10);
        list.add(30);

        List<Integer> list2 = new ArrayList<>();
        list2.add(40);
        list2.add(55);

        Iterator<Integer> iterator = list.iterator();
    /*    System.out.println(iterator.next());        //указать на следующий элемент
        System.out.println(iterator.next());
        System.out.println(iterator.hasNext());     //булево - узнать существует ли следующий элемент в списке
*/
//      пока в списке есть символы - выводить их последовательно (применение итератора в цикле)
        System.out.println("Вывести все значения списка которые находятся в нём: ");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println();
        
    }
}
