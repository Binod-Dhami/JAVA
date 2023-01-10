package SQL;
import java.sql.*;
import java.util.Scanner;

public class Menu {
   
    static Scanner scan=new Scanner(System.in);
    //show recoord
    public void ShowRecord(Connection cn)throws SQLException{
        Statement st= cn.createStatement();
        ResultSet rs=st.executeQuery("SELECT * FROM  student");
        while(rs.next()){
            System.out.println("  roll="  +rs.getInt(1)+"  name="  +rs.getString(2)+"  faculty="  +rs.getString(3));
        }
    }
    //connection close
    public void closeConnection(Connection c)throws SQLException{
        c.close();
        System.out.println("connection close");
    }
    //delete 
    public void deleteByName(Connection cn)throws SQLException{
        System.out.println("enetr the name to be deleted");
        String n=scan.next();
        PreparedStatement st=cn.prepareStatement("DELETE FROM student WHERE name=?");
        st.setString(1, n);
        int r=st.executeUpdate();
        System.out.println("No.of records deleted:"+r);
    }
    //insert data
    public void InsertData(Connection cn)throws SQLException{
        System.out.println("enter the roll no to insert:");
        int roll=scan.nextInt();
        System.out.println("enter the name to insert:");
        String name=scan.next();
        System.out.println("enter the faculty to inseert:");
        String faculty=scan.next();
        String querry="insert into student values(?,?,?)";
        PreparedStatement pst=cn.prepareStatement(querry);
        pst.setInt(1, roll);
        pst.setString(2, name);
        pst.setString(3, faculty);
        int dataAdd=pst.executeUpdate();
        System.out.println("data has been sucessfully added:");
    }
    //update method
    public void UpdateData(Connection cn)throws SQLException{
        System.out.println("enter the name to update:");
        String nameUpdate=scan.next();
        System.out.println("enter the faculty to update:");
        String facultyForUpdate=scan.next();
        String querry="UPDATE student SET name=? WHERE faculty=?";
        PreparedStatement pst=cn.prepareStatement(querry);
        pst.setString(1, nameUpdate);
        pst.setString(2, facultyForUpdate);
        int updated=pst.executeUpdate();
        System.out.println("data has been sucessfully updated:");
    }
        
   //main function
    public static void main(String[]args)throws ClassNotFoundException,SQLException{
      
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection cn=DriverManager.getConnection("Jdbc:mysql://localhost:3306/student","root","");
        Menu dbase=new Menu();
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
                    case 2:
                    dbase.closeConnection(cn);
                    break; 
                    case 3:
                    dbase.deleteByName(cn);
                    break;
                      case 4:
                    dbase.InsertData(cn);
                    break;
                    case 5:
                    dbase.UpdateData(cn);
                    default:
                    dbase.showMenus();
                }
            }
            while(Choice!=4);
        }
    }
            public void showMenus(){
                System.out.println("****MENU****");
                System.out.println("1.ShowData");
                System.out.println("2.Connection Close");
                System.out.println("3.DeleteData");
                System.out.println("4.InsertData");
                System.out.println("5.UpdateData");
              
                

            }
}
