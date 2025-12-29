package week3day3;
import java.io.*;
public class usingbufferedreader {
    public static void main(String [] args)throws IOException{
        BufferedReader br=new BufferedReader(new FileReader("sample.txt"));
        String line;

        while((line=br.readLine()) !=null){
            System.out.println(line);
        }
        br.close();
    }
}
