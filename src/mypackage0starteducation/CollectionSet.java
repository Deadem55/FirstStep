package mypackage0starteducation;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CollectionSet {
    public static void main (String[] args) {

        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(11);
        set.add(12);
        set.add(11);
        set.add(11);

        System.out.println(set.size());
        System.out.println();

//циклы для вывода элементов интерфейса  сет (нельзя как в списке гетом получать энный элемент)

        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println();

        for (int i : set) {
            System.out.println(i);
        }
        System.out.println();

        System.out.println(set.size());
        set.remove(11);
        System.out.println(set.size());
        System.out.println();

        System.out.println(set.contains(10));
        System.out.println(set.contains(11));
        System.out.println();

        set.clear();
        System.out.println(set.size());

    }
}
