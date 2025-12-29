//Scenario 4: Student roll number & name lookup
//
//Collection: HashMap
//Choose: Map
//Reason: Fast searching using key–value pair



package Week2.Day4;
import java.util.*;
public class studentlookup {
    public static void main(String args[]) {

        HashMap<Integer, String> st = new HashMap<>();

        st.put(1,"Rahul");
        st.put(2,"kiran");
        st.put(3,"Rehman");

        System.out.println(st.get(1));

    }
}