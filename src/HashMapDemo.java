import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        Map<Integer, String> hashMap = new HashMap<>(20);
        hashMap.put(10,"A");
        hashMap.put(22,"a");
        hashMap.put(1,"C");
        hashMap.put(null,"Ck");
        System.out.println(hashMap);
    }
}
