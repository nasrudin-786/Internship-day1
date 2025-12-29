//Scenario 1: Attendance list
//
//Collection: LinkedHashSet
//Choose: Set
//Reason: Unique values + maintain insertion order


package Week2.Day4;
import java.util.*;

public class al{
    public static void main(String[] args){
        ArrayList<String>attendance=new ArrayList<>();
        attendance.add("Alice");
        attendance.add("Bob");
        attendance.add("Charlie");

        System.out.println("Attendance list: "+attendance);
    }
}