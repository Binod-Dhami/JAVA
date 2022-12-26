
import java.sql.*;
public class App {
    public static void main(String []args){
        final String url="jdbc:mysql://localhost:3306/student";
        final String uname="root";
        final String pwd="2057122binod";
   
    try{
        Class.forName("com.mysql.jdbc.Drive");
        Connection cn=DriverManager.getConnection(url,uname,pwd);
        Statement stmt=cn.createStatement();
        String query="select name from student where roll=06;";
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
