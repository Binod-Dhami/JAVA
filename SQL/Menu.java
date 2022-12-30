package SQL;
import java.sql.*;
import java.util.Scanner;

public class Menu {
   
    static Scanner scan=new Scanner(System.in);
    public void ShowRecord(Connection cn)throws SQLException{
        Statement st= cn.createStatement();
        ResultSet rs=st.executeQuery("SELECT * FROM  student");
        while(rs.next()){
            System.out.println("ID="+rs.getInt(1)+"ID="+rs.getString(2));
        }
    }
    public void closeConnection(Connection c)throws SQLException{
        c.close();
        System.out.println("connection close");
    }
    public void deleteByName(Connection cn)throws SQLException{
        System.out.println("enetr the name to be deleted");
        String n=scan.next();
        PreparedStatement st=cn.prepareStatement("DELETE FROM student WHERE name=?");
        st.setString(1, n);
        int r=st.executeUpdate();
        System.out.println("No.of records deleted:"+r);
    }
    //insert method
    //update method
    /*String sql2 = "Update Emp set email = ? where empname = ?";
    PreparedStatement pstmt = con.prepareStatement(sql2);
    pstmt.setString(1, "Jaya@gmail.com");
    pstmt.setString(2, "Jaya");
    int rowUpdate = pstmt.executeUpdate();
    if (rowUpdate > 0)
    {
         System.out.println("\nRecord updated successfully!!\n");
    }
    */
    public static void main(String[]args)throws ClassNotFoundException,SQLException{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection cn=DriverManager.getConnection(null, null, null);
        Database dbase=new Database();
        int Choice;
        dbase.showMenus();
        {
            do{
                System.out.println("enetr the choice");
                Choice=scan.nextInt();
                switch(Choice){
                    case 1:
                    dbase.ShowRecord(cn);
                    break;
                    /*case 2:
                    dbase.insert(cn);
                    break;  */
                    case 3:
                    dbase.deleteByName(cn);
                    break;
                      case 4:
                    dbase.closeConnection(cn);
                    break;
                    default:
                    dbase.showMenus();
                }
            }
            while(Choice!=4);
        }
    }
            public void showMenus(){
                System.out.println("****MENU****");
                System.out.println("1.ShowRecord");
                System.out.println("2.InsertRecord");
                System.out.println("3.Delete");
                System.out.println("Connection");

            }
}
