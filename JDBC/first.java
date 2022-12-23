package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class first {
    public static void main (String[]args){

   try{
    Class.forName("");
    Connection con=DriverManager.getConnection("");
    Statement smt=con.createStatement();
    smt.executeUpdate("");
    System.out.println();
    con.close();
   }
   catch(Exception e){
    System.out.print(e);
   }
}
}
