import java.sql.*;

public class jdbctasks {
   private Connection con;

   public jdbctasks(Connection con){
       this.con=con;
   }
public void insertStudents(String name,int age)throws Exception {
    String query = "INSERT INTO students(name,age)VALUES(?,?)";
    PreparedStatement ps = con.prepareStatement(query);
    ps.setString(1, "nasroddin");
    ps.setInt(2, 20);
    ps.executeUpdate();
    System.out.println("Inserted Succesfully");
}

public void getAllStudents() throws Exception{
       String query="SELECT * FROM students";

}
}
