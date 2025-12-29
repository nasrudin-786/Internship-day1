//Scenario 7: Store leaderboard scores sorted
//
//Collection: TreeSet
//Choose: Set
//Reason: Stores unique values in sorted order



package Week2.Day4;
import java.util.*;
public class leadreboard {
    public static void main(String[] args){
        TreeSet<Integer> scores=new TreeSet<>();

        scores.add(80);
        scores.add(90);
        scores.add(70);

        System.out.println(scores);
    }
}
