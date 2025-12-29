//Scenario 5: Manage print queue jobs
//
//Collection: Queue (LinkedList)
//Choose: Queue
//Reason: Follows FIFO (First In First Out)




package Week2.Day4;
import java.util.*;
public class pqjobs {
    public static void main(String[] args){

        Queue<String> q=new LinkedList<>();

        q.add("Doc1");
        q.add("Doc2");

        System.out.println(q.poll());


    }
}
