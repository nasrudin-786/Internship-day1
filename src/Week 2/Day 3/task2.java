import java.util.*;

public class task2{
    public static void main(String [] args)
    {
        HashMap<Integer,Integer> map=new HashMap<>();
        Scanner sc=new Scanner(System.in);

        for(int i=1;i<=5;i++){
            System.out.println("Enter roll no :'");
             int roll=sc.nextInt();

            System.out.println("Enter marks");
            int marks=sc.nextInt();

            map.put(roll,marks);

        }
        System.out.println( "enter roll number to update marks");
        int updateRoll=sc.nextInt();

        if(map.containsKey(updateRoll)) {
            System.out.println("enter new marks :");
            int newMarks = sc.nextInt();
            map.put(updateRoll, newMarks);
            System.out.println("Marks updated !");
    }else{
            System.out.println("Roll number not found");
        }

        System.out.println("\nEnter roll no. to search");
        int searchRoll=sc.nextInt();

        if(map.containsKey(searchRoll)){
            System.out.println("Marks :"+map.get(searchRoll));
        }else{
            System.out.println("Student not found !");
        }
        System.out.println("full student marks list :");
        System.out.println(map);
    }
}