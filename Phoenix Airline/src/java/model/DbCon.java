package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbCon {
    public Connection Connection() throws ClassNotFoundException ,SQLException
    {
       Class.forName("com.mysql.jdbc.Driver");
       Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/phoenix_airline","root","");
       return con;        
    }
}
