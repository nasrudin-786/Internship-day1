package week3day4;
import java.io.*;
import java.util.*;
public class simplefilewriter {
    public static void main(String[] args)throws IOException{
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter log message" );
        String message=sc.nextLine();

        FileWriter fw=new FileWriter("log.text",true);
        fw.write(message +"\n");
        fw.close();

        System.out.println(("Log added successful"));
    }
}
