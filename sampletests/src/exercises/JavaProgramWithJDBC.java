package exercises;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JavaProgramWithJDBC {

	static final String DB_URL = "jdbc:mysql://localhost/samplejdbc";
	   static final String USER = "testjdbc";
	   static final String PASSWORD = "testjdbc123";
	   static final String QUERY = "SELECT id, first, last, age FROM Employees";

	   public static void main(String[] args) {
		      // Open a connection
		      try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASSWORD);
		         Statement stmt = conn.createStatement();
		         ResultSet rs = stmt.executeQuery(QUERY);) {
		         // Extract data from result set
		         while (rs.next()) {
		            // Retrieve by column name
		            System.out.print("ID: " + rs.getInt("id"));
		            System.out.print(", Age: " + rs.getInt("age"));
		            System.out.print(", First: " + rs.getString("first"));
		            System.out.println(", Last: " + rs.getString("last"));
		         }
		      } catch (SQLException e) {
		         e.printStackTrace();
		      } 
		   }
	
}
