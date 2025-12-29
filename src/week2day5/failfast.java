package week2day5;
import java.util.*;
public class failfast {
    public static void main(String [] args){
        ArrayList<String> list=new ArrayList<>();
        list.add("A");
        list.add("B");

        Iterator<String> itr=list.iterator();

        while(itr.hasNext()){
            System.out.println(itr.next());
            list.add("new");
        }
    }
}
