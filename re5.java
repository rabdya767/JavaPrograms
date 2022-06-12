//import java.util.regex.Pattern;
import java.util.regex.*;
public class re5
{
    public static void main(String args[]) 
    {
        
               String str="RABDYA";
               String i="113";
               String c="CaBcAb";
               String space="    ";
                      
               System.out.println(Pattern.matches("\\w{6}",str));
               System.out.println(Pattern.matches("\\w{6}",c));    
               System.out.println(Pattern.matches("\\D{4,7}",str));
               System.out.println(Pattern.matches("\\D{0,9}",c));
               System.out.println(Pattern.matches("\\d{2,10}",i));
               System.out.println(Pattern.matches("\\d{2,4}",i));
               System.out.println(Pattern.matches("\\s{4}",space));
               System.out.println(Pattern.matches("\\S{0,6}",c));    

            
               System.out.println(space.matches("\\W{0,5}"));
               System.out.println(c.matches("\\w{6}"));    
               System.out.println(str.matches("\\D{4,7}"));
               System.out.println(i.matches("\\D{33}"));
               System.out.println(str.matches("\\d{2,10}"));
               System.out.println(i.matches("\\d{2,4}"));
               System.out.println(space.matches("\\s{4}"));
               System.out.println(c.matches("\\S{0,6}"));    
           
           
               
    }   
}