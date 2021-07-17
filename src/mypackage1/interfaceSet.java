package mypackage1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class interfaceSet {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();     //коллекция Set может хранить в себе только уникальные значения и не содержит метода Get
        Set<Integer> treeSet = new TreeSet<>();     // в отличии от Hash - по умолчанию имеет сортировку значений в порядке добавления
        set.add(10);
        set.add(11);
        set.add(10);
        set.add(11);
        set.add(24);
        set.add(35);

        System.out.println("Количество значений в коллекции листа set: ");
        System.out.println(set.size());     //учитываются только уникальные значения
        System.out.println();

//        использование итератора для вывода всех значений, так как Get в данной коллекции не используетя
        System.out.println("Вывести все значения листа Set через условие while: ");
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println();

        System.out.println("Вывести все значения листа  Set через условие for each: ");
        for (int counterName: set) {
            System.out.println(counterName);
        }
        System.out.println();

//        удаление элемента из списка Set. В отличии от List - в Set удаление происходит по значению, а не по индексу
        System.out.println("Удаление элемента из коллекции Set: ");
        for (int counterName: set) {
            System.out.println(counterName);
        }
        System.out.println();
        set.remove(11);
        for (int counterName: set) {
            System.out.println(counterName);
        }
        System.out.println();

        treeSet.add(10);
        treeSet.add(13);
        treeSet.add(20);
        treeSet.add(15);
        treeSet.add(20);
        treeSet.add(52);
        System.out.println("Значения treeSet коллекции: ");
        for (int counterName: treeSet) {
            System.out.println(counterName);
        }
        System.out.println();
        treeSet.remove(20);
        System.out.println("Значения treeSet коллекции после удаления элемента со значением 20: ");
        for (int counterName: treeSet) {
            System.out.println(counterName);
        }
        System.out.println();

        System.out.println(set.size());
//        set.clear();
        System.out.println(set.size());
        System.out.println();

        System.out.println(set.contains(10));
        System.out.println(set.contains(11));

    }
}
