package week3day4;
import java.io.*;
public class loganalyzer {
    public static void main(String [] args) throws IOException{
        BufferedReader br=new BufferedReader(new FileReader("log.txt"));

        String line;
        int totalLines = 0, infoCount = 0, warnCount = 0, errorCount = 0;
        String longestLine = "";
        String firstTimestamp = null;
        String lastTimestamp = null;

        while ((line = br.readLine()) != null) {
            totalLines++;

            if (line.contains("INFO")) infoCount++;
            else if (line.contains("WARN")) warnCount++;
            else if (line.contains("ERROR")) errorCount++;


            if (line.length() > longestLine.length()) {
                longestLine = line;
            }


            String timestamp = line.split(" ")[0] + " " + line.split(" ")[1];
            if (firstTimestamp == null) firstTimestamp = timestamp;
            lastTimestamp = timestamp;
        }

        br.close();

        System.out.println("Total log lines: " + totalLines);
        System.out.println("INFO count: " + infoCount);
        System.out.println("WARN count: " + warnCount);
        System.out.println("ERROR count: " + errorCount);
        System.out.println("Longest log line: " + longestLine);
        System.out.println("First timestamp: " + firstTimestamp);
        System.out.println("Last timestamp: " + lastTimestamp);
    }
}

