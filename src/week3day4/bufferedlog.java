package week3day4;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Scanner;


public class bufferedlog {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter log message: ");
        String message = sc.nextLine();

        BufferedWriter bw = new BufferedWriter(new FileWriter("log.txt", true));
        bw.write(LocalDateTime.now() + " INFO " + message);
        bw.newLine();
        bw.close();

        System.out.println("Log added with timestamp!");
    }
}
