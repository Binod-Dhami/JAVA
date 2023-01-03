package SQL;


import java.sql.*;  
class ResultMeta{  
public static void main(String args[])
throws ClassNotFoundException,SQLException{  
Class.forName("com.mysql.jdbc.Driver");  
Connection con=DriverManager.getConnection(  
"jdbc:mysql://localhost/student","root","2057122binod");  
  
PreparedStatement ps=con.prepareStatement("select * from student");  
ResultSet rs=ps.executeQuery();  
ResultSetMetaData rsmd=rs.getMetaData();  
  
System.out.println("Total columns: "+rsmd.getColumnCount());  
System.out.println("Column Name of 1st column: "+rsmd.getColumnTypeName(1));  
System.out.println("Column Table Name of 1st column: "+rsmd.getTableName(1));  
  
con.close();  
}
}  
