import java.util.regex.*;
public class re_mail 
{
public static void main(String[] args) 
{
System.out.println(Pattern.matches("\\S+@+\\S+", "rabdya@gmail.com"));
System.out.println(Pattern.matches("\\S+@+\\S+", "santhoshr.be22@uceou.edu"));
System.out.println(Pattern.matches("\\S+@+\\S+", "rabdya767@org"));
System.out.println(Pattern.matches("\\S+@+\\S+", "santhosh@hotmail.com"));
System.out.println(Pattern.matches("\\S+@+\\S+", "rabdya@outlook.com"));
System.out.println(Pattern.matches("\\S+@+\\S+", "raju.p34@mvsr"));
System.out.println(Pattern.matches("\\S+@+\\S+", "rabdya@456gmail.com"));
System.out.println(Pattern.matches("\\S+@+\\S+", "youtube@uk"));
}   
}