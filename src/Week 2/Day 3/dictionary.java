import java.io.*;
import java.util.*;

public class dictionary {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        Map<String,String> ij=new HashMap<>();

        for(int i=1;i<=5;i++){
            System.out.println("Enter word "+ i +":");
            String word=sc.nextLine();

            System.out.println("Enter meaning :");
            String meaning=sc.nextLine();
 
            ij.put(word,meaning);
        }

        System.out.println("\n Enter word to search :");
        String searchWord=sc.nextLine();

        if(ij.containsKey(searchWord)) {
            System.out.println("Meaning :" + ij.get(searchWord));
        }else{
            System.out.println("word not found in the directions ");
        }

    }
}