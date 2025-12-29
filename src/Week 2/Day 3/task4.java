import java.util.*;
public class task4 {
    public static void main(String[] args){

        TreeMap<Integer,String> emp=new TreeMap<>();
        emp.put(103,"rohit");
        emp.put(101, "Amit");
        emp.put(105, "Neha");
        emp.put(102, "Priya");
        emp.put(104, "Kunal");

        System.out.println("Sorted Employee List:");
        for (var e : emp.entrySet()) {
            System.out.println(e.getKey() + " -> " + e.getValue());
        }
    }
}