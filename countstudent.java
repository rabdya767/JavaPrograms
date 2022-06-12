import java.util.*;
import java.lang.SuppressWarnings;
class studentcount
{
    private static int count=1;
    private String rollno;
    studentcount()
    {
        rollno=generateRN();
    }

    @SuppressWarnings("deprecation")
    private String generateRN()
    {
        Date d=new Date();
        String rn="UNIV-"+(d.getYear()+1900)+"-"+count;
        count++;
        return rn;
    }
    
    public String getrollno()
    {
        return rollno;
    }

}
public class countstudent {
    
 public static void main(String[] args) {
     studentcount s1=new studentcount();
     studentcount s2=new studentcount();
     studentcount s3=new studentcount();
     studentcount s4=new studentcount();

     System.out.println("RollNu is "+s1.getrollno());
     System.out.println("RollNu is "+s2.getrollno());
     System.out.println("RollNu is "+s3.getrollno());
     System.out.println("RollNu is "+s4.getrollno());
 }   
}