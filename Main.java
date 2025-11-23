import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {

            Class.forName("org.postgresql.Driver");

            String url = "jdbc:postgresql://localhost:5432/internship_day1"; // make sure DB name is correct
            String user = "postgres";
            String password = "nasru 786";

            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected successfully!");

            stmt = conn.createStatement();


            String insertSQL = "INSERT INTO student (name, email, dept_id) VALUES ('Zara', 'zara@example.com', 2)";
            stmt.executeUpdate(insertSQL);
            System.out.println("New student inserted.");

            String selectSQL = "SELECT * FROM student";
            rs = stmt.executeQuery(selectSQL);

            System.out.println("\nList of students:");
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id") +
                        ", Name: " + rs.getString("name") +
                        ", Email: " + rs.getString("email") +
                        ", Dept_ID: " + rs.getInt("dept_id"));
            }


            String updateSQL = "UPDATE student SET email='zara123@example.com' WHERE name='Zara'";
            stmt.executeUpdate(updateSQL);
            System.out.println("\nStudent email updated.");


            String deleteSQL = "DELETE FROM student WHERE name='Zara'";
            stmt.executeUpdate(deleteSQL);
            System.out.println("Student deleted.");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {

            try {
                if (rs != null) rs.close();
            } catch (Exception ignored) {
            }
            try {
                if (stmt != null) stmt.close();
            } catch (Exception ignored) {
            }
            try {
                if (conn != null) conn.close();
            } catch (Exception ignored) {
            }
            System.out.println("\nAll connections closed.");
        }
    }
}