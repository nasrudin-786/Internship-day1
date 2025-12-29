package week3day4;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class logsinloop {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("log.txt", true));

        for (int i = 1; i <= 25; i++) {
            bw.write(LocalDateTime.now() + " INFO Application running smoothly " + i);
            bw.newLine();
        }
        for (int i = 1; i <= 15; i++) {
            bw.write(LocalDateTime.now() + " WARN Low memory warning " + i);
            bw.newLine();
        }

        for (int i = 1; i <= 10; i++) {
            bw.write(LocalDateTime.now() + " ERROR Invalid input detected " + i);
            bw.newLine();
        }

        bw.close();
        System.out.println("50 logs generated successfully!");
    }
}
