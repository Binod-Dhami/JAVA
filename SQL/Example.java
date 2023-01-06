package SQL;


import java.sql.*;
public class Example
{
    public static void main(String[] args)
    {

         String url ="jdbc:mysql://localhost:3306/student";
         String uname = "root";
         String upass = "";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection cn = DriverManager.getConnection(url,uname,upass);
            System.out.println("Connected Successfully");
            Statement stmt = cn.createStatement();
            String q = "SELECT * FROM student";
            ResultSet Rs = stmt.executeQuery(q);
             while(Rs.next())
             {
                 System.out.println("Roll: " + Rs.getInt(1)+"Name: "+Rs.getString(2)+ Rs.getString(3));
             }
            cn.close();
        }
        catch (ClassNotFoundException e)
        {
            System.out.println(e.getMessage());
        }
        catch (SQLException e)
        {
            System.out.println(e.getMessage());
        }

    }
}


