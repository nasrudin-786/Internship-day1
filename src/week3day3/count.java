package week3day3;
import java.io.*;
public class count {
   public static void main(String[] args) throws IOException{

       BufferedReader br =new BufferedReader(new FileReader("sample.txt"));
       String line;
       int lines=0,words=0,characters=0;

       while((line=br.readLine()) !=null){
           lines++;
           characters +=line.length();

           String[] wordArray=line.split("\\s+");
           words += wordArray.length;
       }
       br.close();

       System.out.println("Lines :" + lines);
       System.out.println("Words :" +words);
       System.out.println("Characters :" + characters);
   }
}
