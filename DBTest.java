import java.sql.*;
class DBTest{
    public static void main(String[] args) {
      try {
         Class.forName("org.apache.derby.jdbc.ClientDriver");
      }
      catch(ClassNotFoundException e) {
         System.out.println("Class not found "+ e);
      }
      try {
         Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/student","root","root");
         Statement stmt = con.createStatement();
         ResultSet rs = stmt.executeQuery("SELECT * FROM student");
         System.out.println("id  name    class");
         while (rs.next()) {
            int id = rs.getInt("ID");
            String name = rs.getString("name");
            String class = rs.getString("class");
            System.out.println(id+"   "+name+"    "+class);
         }
      }
      catch(SQLException e){
         System.out.println("SQL exception occured" + e);
      }
   }
}