package JDBC;
import java.sql.*;
public class Second {
    public static void main(String []args){
        final String url="jdbc:mysql://localhost:3306/student";
        final String uname="root";
        final String pwd="binod123";
   
    try{
        Class.forName("com.mysql.jdbc.Drive");
        Connection cn=DriverManager.getConnection(url,uname,pwd);
        Statement stmt=cn.createStatement();
        String query="SELECT * FROM STUDENT";
        ResultSet rs=stmt.executeQuery(query);
        while(rs.next()){
            System.out.println("Roll:"+ rs.getInt(1)+"Name:"+ rs.getString(2)+"Faculty:"+ rs.getString(3));
        }
        cn.close();
    }
    catch(ClassNotFoundException e){
        System.out.println(e.getMessage());
    }
    catch(SQLException e){
        System.out.println(e.getMessage());
    } 
}
}
