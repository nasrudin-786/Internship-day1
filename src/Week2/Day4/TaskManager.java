//Scenario 10: Manage tasks by priority
//
//Collection: PriorityQueue
//Choose: Queue
//Reason: Processes elements based on priority



package Week2.Day4;
import java.util.*;
public class TaskManager {
        public static void main(String[] args) {
            PriorityQueue<Integer> tasks = new PriorityQueue<>();

            tasks.add(3);
            tasks.add(1);
            tasks.add(2);

            System.out.println(tasks.poll());
        }
    }

