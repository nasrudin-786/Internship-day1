//Scenario 9: Cache with insertion order
//
//Collection: LinkedHashMap
//Choose: Map
//Reason: Maintains insertion order of elements




package Week2.Day4;
import java.util.*;
public class cache {
        public static void main(String[] args) {
            LinkedHashMap<Integer, String> cache = new LinkedHashMap<>();

            cache.put(1, "Data1");
            cache.put(2, "Data2");

            System.out.println(cache);
        }
    }


