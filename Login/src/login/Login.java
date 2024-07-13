package login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.*;

public class Login {

    public static void main(String[] args) {
        
    String url = "jdbc:mysql://localhost:3306/logindb";
    String username = "root";
    String password = "root";
    String query = "select *from mylogintbl";
    
    try{
    Class.forName("com.mysql.cj.jdbc.Driver"); // Register the driver class
    Class.forName("com.mysql.cj.jdbc.Driver");
    
    //using the forName method
    
    // Create a connection object
    Connection con1 = DriverManager.getConnection(url, username, password);
    //Connection con2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/login", "root","root" );
    
    // Create a connection statement
    Statement st1 = con1.createStatement();
    
    // Executing the query
    ResultSet rs1 = st1.executeQuery(query);

    // Looping throught the query
    if(rs1.next()){
    String loginData = rs1.getString(1) + " : " + rs1.getString(2);

    System.out.println(loginData);

    rs1.close();
    st1.close();
    con1.close(); // close connection
    }
    
    }catch(SQLException se){
    se.printStackTrace();

    }
    catch(Exception e)
        {
        e.printStackTrace();
        }
    }
}

