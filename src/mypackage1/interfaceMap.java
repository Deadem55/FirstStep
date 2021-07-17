package mypackage1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class interfaceMap {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>(); // Интерфейс<Тип ключа, тип значения> имя
        map.put(0, "Black");
        map.put(1, "White");
        map.put(2, "Blue");
        map.put(17, "Red");

        System.out.println(map.get(0));
        System.out.println(map.get(17));
        System.out.println();

        System.out.println(map.size());
//        map.clear();
        System.out.println(map.size());
        System.out.println();

//        содержится ли в инерфейсе мап указанный ключ или значение
        System.out.println("Содержится ли указанный ключ в интерфейсе мап: " );
        System.out.println(map.containsKey(2));
        System.out.println(map.containsKey(10));
        System.out.println();

        System.out.println("Содержится ли указанное значение в интерфейсе мап: " );
        System.out.println(map.containsValue("Yellow"));
        System.out.println(map.containsValue("White"));
        System.out.println();

//        получить множество ключей содержащихся в интерфейсе мап
        Set<Integer> keySet = map.keySet();
        Iterator<Integer> iterator= keySet.iterator();
        while (iterator.hasNext()) {
            System.out.println(map.get(iterator.next()));
        }
        System.out.println();

//        обновить значение по ключу
        System.out.println("Обновить значени по ключу 2 = Blue на 2 = Yellow: ");
        System.out.println(map.get(2));
        map.put(2, "Yellow");
        System.out.println(map.get(2));
        System.out.println();

        Map<String, String> map2 = new HashMap<>();
        map2.put("Ivan", "Ivanov");
        map2.put("Petr", "Petrov");
        map2.put("Aleksey", "Alekseev");
        System.out.println(map2.get("Petr"));
    }
}
