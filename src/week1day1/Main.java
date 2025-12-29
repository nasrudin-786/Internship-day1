package week1day1;
import java.sql.*;
public class Main
{

    public static void main(String[] args) {

        String url = "jdbc:postgresql://localhost:5432/internship_day1";
        String user = "postgres";
        String password = "nasru 786";

        Connection con = null;

        try {
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection(url, user, password);
            System.out.println("Connected successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (con != null)
                    con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

