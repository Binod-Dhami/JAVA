package SQL;
import java.sql.*;
public class JDBC {
    public static void main(String []args){
        final String url="jdbc:mysql://localhost:3306/student";
        final String uname="root";
        final String pwd="";
   
    try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection cn=DriverManager.getConnection(url,uname,pwd);
        Statement stmt=cn.createStatement();
        String query="SELECT * FROM student";
        ResultSet rs=stmt.executeQuery(query);
        while(rs.next()){
            System.out.println("Roll:"+ rs.getInt(1)+"  Name:"+ rs.getString(2)+"  Faculty:"+ rs.getString(3));
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
