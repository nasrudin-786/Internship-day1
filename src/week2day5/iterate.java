package week2day5;
import java.util.*;
public class iterate {
    public static void main(String args[]) {

        List<String> list = new ArrayList<>();

        list.add("Nasrudin");
        list.add("toufique");
        list.add("noore");
        list.add("rehman");

        System.out.println("Using Iterator");
        Iterator<String> it= list.iterator();
        while(it.hasNext()){
        System.out.println(it.next());

        System.out.println("Using for -each");
        for(String lang : list){
        System.out.println(lang);


        System.out.println("Using ListIterator");
        ListIterator<String> li=list.listIterator(list.size());
        while(li.hasPrevious()){
        System.out.println(li.previous());
                }
    }        }
        }
    }


