//Scenario 6: Keep browser back–forward history
//
//Collection: Stack
//Choose: Stack
//Reason: Follows LIFO (Last In First Out)



package Week2.Day4;
import java.util.*;
public class kbbfhistory {
    public static void main(String[] args){
        Stack<String> h=new Stack<>();

        h.push("Google");
        h.push("youTube");

        System.out.println(h.pop());
    }
}
