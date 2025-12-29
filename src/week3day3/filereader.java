package week3day3;
import java.io.*;
public class filereader {
    public static void main(String args[]) throws Exception{
        FileReader fr=new FileReader("sample.txt");
        int ch;

        while((ch=fr.read()) != -1){
            System.out.print((char) ch);
        }
        fr.close();
    }
}
