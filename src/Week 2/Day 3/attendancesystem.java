import java.util.*;

public class attendancesystem {
    public static void main(String[] args){
        LinkedHashMap<Integer,String> at=new LinkedHashMap<>();
        Scanner sc=new Scanner(System.in);

        for(int i=1;i<=5;i++){
            System.out.println("Enter roll number ");
            int roll=sc.nextInt();
            sc.nextLine();

            System.out.println("Enter Name :");
            String name=sc.nextLine();

            if(!at.containsKey(roll)){
                at.put(roll,name);
            }else{
                System.out.println("Duplicate roll ignored ");

            }
        }

        System.out.println("Attendance list:");
        for(var entry :at.entrySet()){
            System.out.println(entry.getKey() +"->"+entry.getValue());
        }
        System.out.println("\n enter roll number to search: ");
        int search=sc.nextInt();

        if(at.containsKey(search)){
            System.out.println("Student"+at.get(search));
        }else{
            System.out.println("Student not found!");
        }

    }

}
