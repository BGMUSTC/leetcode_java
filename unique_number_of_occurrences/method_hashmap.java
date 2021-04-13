package unique_number_of_occurrences;

import java.util.HashMap;
import java.util.HashSet;

public class method_hashmap {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        HashSet<Integer> res = new HashSet<>();
        for (int a : arr) {
            if (!map.containsKey(a)) {
                map.put(a,1);
            } else {
                map.replace(a,map.get(a)+1);
            }
        }
        for (Integer v : map.values()) {
            if (!res.contains(v)) {
                res.add(v);
            } else {
                return false;
            }
        }
        return true;
    }
}
