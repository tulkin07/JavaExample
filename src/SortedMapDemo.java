import java.util.*;

public class SortedMapDemo {
    public static void main(String[] args) {

        Map <Integer ,String> hashMap = new IdentityHashMap<>();
         Integer num1 = new Integer(1);
//         Integer num2 = new Integer(1);
         hashMap.put(num1,"Ali");
         hashMap.put(num1,"Vali");
        System.out.println(hashMap);

    }
}
