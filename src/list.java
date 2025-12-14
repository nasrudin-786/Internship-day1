import java.util.HashSet;
import java.util.*;
import java.io.*;
import java.util.*;
public class list {
    public static void main(String[] args) {

        List<String> h = new ArrayList<>();

        h.add("aman");
        h.add("neha");
        h.add("aman");
        h.add("Rohit");
        h.add("neha");
        h.add("sahil");
        h.add("aman");

        Set<String> uniqueSet = new HashSet<>(h);

        System.out.println("---Origional list with duplicates---");
        System.out.println(h);

        System.out.println("Set with unique values");
        System.out.println(uniqueSet);

        List<String> uniqueList = new ArrayList<>(uniqueSet);
        System.out.println("Converted back to list");
        System.out.println(uniqueList);
    }
}
