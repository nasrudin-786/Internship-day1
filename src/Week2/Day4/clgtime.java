//Scenario 3: College timetable (sorted by time)
//
//Collection: TreeMap
//Choose: Map
//Reason: Stores key–value pairs in sorted order by key


package Week2.Day4;
import java.util.*;
public class clgtime {
    public static void main(String[] args){
        TreeMap<String,String> tim=new TreeMap<>();
        tim.put("09:00","Maths");
        tim.put("11:00","java");
        tim.put("11:00","Physics");

        System.out.println(tim);
    }

}
