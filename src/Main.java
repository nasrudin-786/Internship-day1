import java.sql.*;

public class Main {

    private Connection con;

    public Main(Connection con) {
        this.con = con;
    }

    public void insertStudent(String name, int age) throws Exception {
        String query = "INSERT INTO students(name, age) VALUES(?, ?)";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setString(1, name);
        ps.setInt(2, age);
        ps.executeUpdate();
        System.out.println("Inserted Successfully");
        ps.close();
    }

    public void getAllStudents() throws Exception {
        String query = "SELECT * FROM students";
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(query);

        while (rs.next()) {
            System.out.println("ID: " + rs.getInt("id") +
                    ", Name: " + rs.getString("name") +
                    ", Age: " + rs.getInt("age"));
        }
        rs.close();
        stmt.close();
    }

    public void updateStudent(int id, String newName) throws Exception {
        String query = "UPDATE students SET name = ? WHERE id = ?";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setString(1, newName);
        ps.setInt(2, id);
        int rows = ps.executeUpdate();
        if (rows > 0) System.out.println("Student Updated Successfully");
        else System.out.println("No Student found with ID " + id);
        ps.close();
    }

    public void deleteStudent(int id) throws Exception {
        String query = "DELETE FROM students WHERE id = ?";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setInt(1, id);
        int rows = ps.executeUpdate();
        if (rows > 0) System.out.println("Student Deleted Successfully");
        else System.out.println("No Student found with ID " + id);
        ps.close();
    }

    public static void main(String[] args) {
        try {
            Class.forName("org.postgresql.Driver");
            String url = "jdbc:postgresql://localhost:5432/internship_dayy1";
            String user = "postgres";
            String password = "nasru 786";
            Connection con = DriverManager.getConnection(url, user, password);

            Main tasks = new Main(con);

            tasks.insertStudent("Nasroddin", 20);
            tasks.getAllStudents();
            tasks.updateStudent(1, "Boss");
            tasks.getAllStudents();
            tasks.deleteStudent(1);
            tasks.getAllStudents();

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
