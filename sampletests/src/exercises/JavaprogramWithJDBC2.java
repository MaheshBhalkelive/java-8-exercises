package exercises;

import java.sql.*;

public class JavaprogramWithJDBC2 {

	public static void main(String[] args) throws ClassNotFoundException {
		
		  // SQL Query
        String QUERY = "select * from employee_details";
        
        //register the oracle driver with DriverManager
        Class.forName("oracle.jdbc.driver.OracleDriver"); 
        
        //Created connection
        try(Connection conn = DriverManager.getConnection("jdbc:oracle:thin:system/pass123@localhost:1521:XE")) //url, user, password
        {
                Statement statemnt1 = conn.createStatement();
                //Created statement
                ResultSet resultSet = statemnt1.executeQuery(QUERY); 
                {   
                    //Get the values of the record
                    while(resultSet.next())
                    {
                        int empNum = resultSet.getInt("empNum");
                        String lastName = resultSet.getString("lastName");
                        String firstName = resultSet.getString("firstName");
                        String email = resultSet.getString("email");
                        String deptNum = resultSet.getString("deptNum");
                        String salary = resultSet.getString("salary");
                        
                        //print the values from ResultSet
                    System.out.println(empNum + "," +lastName+ "," +firstName+ "," +email +","+deptNum +"," +salary);
                    }
                } 
        }
        catch (SQLException e) {
            //If exception occurs catch it and exit the program
            e.printStackTrace();
        }

	}

}
