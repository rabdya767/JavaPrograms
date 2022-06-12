import java.sql.*;
public class db
{
   public static void main(String[] args) throws ClassNotFoundException,SQLException {
    Class.forName("org.sqlite.JDBC");
    Connection con=DriverManager.getConnection("jdbc:sqlit:C://sqlite//rabdya.db");
    Statement stm=con.createStatement();
    ResultSet rs=stm.executeQuery("select * from rabdya.dept");

int dno;
String dname;

    while(rs.next())
    {

        dno=rs.getInt("deptno");
        dname=rs.getString("dname");
        System.out.println(dno+" "+dname);
    }

    }
}