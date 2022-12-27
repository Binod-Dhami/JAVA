package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class first {
    public static void main (String[]args){

   try{
    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/<name of database>" ,<uname>,<psw>);
    Statement stmt=con.createStatement();
    stmt.executeUpdate("");
    System.out.println();
    con.close();
   }
   catch(Exception e){
    System.out.print(e);
   }
}
}
