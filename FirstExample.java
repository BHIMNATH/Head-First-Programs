import java.sql.*;
public class FirstExample{
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost/EMP";
	static final String USER="root";
	static final String PASS="root";
	public static void main(String[] args) {
		Connection conn=null;
		Statement stmt=null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Connecting to Database");
			conn=DriverManager.getConnection(DB_URL,USER,PASS);
			System.out.println("Creating Statement");
			stmt=conn.createStatement();
			String sql;
			sql="SELECT id,first,last,age from EMPLOYEES";
			ResultSet rs=stmt.executeQuery(sql);
			while(rs.next()){
				int id=rs.getInt("id");
				int age=rs.getInt("age");
				String first=rs.getString("first");
				String last=rs.getString("last");
				System.out.print("ID: " + id);
         System.out.print(" Age: " + age);
         System.out.print(" First: " + first);
         System.out.println(" Last: " + last);
			}
				rs.close();
	      stmt.close();
	      conn.close();
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		finally{
				try{
					if(stmt!=null)
						stmt.close();
					      }
					      catch(SQLException se){
         se.printStackTrace();
    		  }
   		}
   		System.out.println("Goodbye!");
	}
}