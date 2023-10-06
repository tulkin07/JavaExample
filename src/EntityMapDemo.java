import java.util.Collection;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class EntityMapDemo {
    public static void main(String[] args) {
        Map<Integer, String> identityHashMap = new IdentityHashMap<>();
        Integer i1 = new Integer(101);
        Integer i2 = new Integer(101);
        identityHashMap.put(1, "Ali");
        identityHashMap.put(10, "Anvar");
        identityHashMap.put(101, "nozim");
        System.out.println(identityHashMap);
//        Collection values = identityHashMap.values();
//        for (Object value : values) {
//            System.out.println(value);
//        }
    }
}
