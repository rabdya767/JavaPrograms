import java.util.regex.*;  
public class re7

{  
public static void main(String args[]){  
//1st way  
Pattern p = Pattern.compile("RABDYA.*");  
Matcher m = p.matcher("RABDYASANTHOSH");  
boolean b = m.matches();  
  
//2nd way  
boolean b2=Pattern.compile(".Ab").matcher("RAb").matches();  
  
//3rd way  
boolean b3 = Pattern.matches("Main.*", "MainString");  
  
System.out.println(b+" "+b2+" "+b3);  
}
}