import java.util.*;

public class WeekHashMapDemo {
    public static void main(String[] args) {
        Map<Integer, String> weakHashMap = new WeakHashMap<>();
        weakHashMap.put(1,"a");
        weakHashMap.put(1025,"ac");
        weakHashMap.put(1035,"acdds");
//        System.out.println(weakHashMap);
//        System.out.println(weakHashMap);
//        weakHashMap

        NavigableMap navigableMap = new TreeMap();
        System.out.println(navigableMap.headMap(0));
        System.out.println("test");
    }
}
