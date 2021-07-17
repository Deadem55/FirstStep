package mypackage0starteducation;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class CollectionMap {
    public static void main(String[] args) {
//создание интерфейса<тип ключа, тип значения> имя создаваемого интерфейса = . Ключ присваемый значениям всегда уникальный, но значения могут повторяться
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Black");
        map.put(2, "White");
        map.put(3, "Yellow");
        map.put(10, "Green");

        System.out.println(map.get(1));
        System.out.println(map.get(10));
        System.out.println();

        System.out.println(map.size());
//        map.clear();
        System.out.println(map.size());
        System.out.println();

        System.out.println(map.containsKey(4));
        System.out.println(map.containsKey(10));
        System.out.println(map.containsValue("White"));
        System.out.println(map.containsValue("Grey"));
        System.out.println();

        Set<Integer> keys = map.keySet();
        Iterator<Integer> iterator = keys.iterator();
        while (iterator.hasNext()) {
            System.out.println(map.get(iterator.next()));
        }
        System.out.println();

        System.out.println(map.get(2));
        map.put(2, "Yellow");
        System.out.println(map.get(2));


    }
}
