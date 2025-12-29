//Scenario 2: Remove duplicates from exam submissions
//
//Collection: HashSet
//Choose: Set
//Reason: Automatically removes duplicate entries

package Week2.Day4;
import java.util.*;

public class examsub {
    public static void main(String[] args) {
        Set<String> submissions = new HashSet<>();
        submissions.add("PRN001");
        submissions.add("PRN002");
        submissions.add("PRN001");

        System.out.println(submissions);
    }
}
