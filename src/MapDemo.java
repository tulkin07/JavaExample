import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {
    public static void main(String[] args) {
        HashMap <Integer ,String>  hashMap0 = new HashMap();
        hashMap0.put(0,"Nozim");
        HashMap <Integer ,String>  hashMap = new HashMap();


        hashMap.put(1,"Ali");
        hashMap.put(2,"Hali");
        hashMap.put(30,"Vali");
        hashMap.putAll(hashMap0);
        System.out.println(hashMap.get(0));
        hashMap.remove(0);
        System.out.println(hashMap.containsKey(1));
        System.out.println(hashMap.containsValue("Ali"));
        System.out.println(hashMap.isEmpty());
        System.out.println(hashMap.size());
        hashMap.clear();
        Collection<String> values = hashMap.values();
        System.out.println(hashMap.entrySet());
        hashMap.replace(1,"Tolqin");
       HashMap clone  = (HashMap) hashMap.clone();
        System.out.println(hashMap);
        System.out.println(clone);
        System.out.println(hashMap.keySet());
        System.out.println(hashMap.values());
        System.out.println(hashMap);

        Set<Map.Entry<Integer, String>> entries = hashMap.entrySet();
        System.out.println(entries);
        for (Map.Entry<Integer, String> entry : entries) {
            System.out.println(entry);
        }
        System.out.println(entries);

    }
}
