import java.io.*;
public class bfdrdr
{
public static void main(String args[]) throws IOException
{
InputStreamReader inp=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(inp);

System.out.println("Enter Your Name? ");
String str1=br.readLine();

System.out.println("Enter Your RoolNumber");
String str=br.readLine();
long RollNumber=Long.parseLong(str);

System.out.println("Enter Your Gender(M/F)? ");
char str2=(char)br.read();
/**
 *br.skip(2);
 *char str2=br.readLine().charAt(0);
 * ?RABDYA SANTHOSH
 */
System.out.println("Enter Your Salary? ");
String sal=br.readLine();
float f=Float.parseFloat(sal);

System.out.println("Name is "+str1);
System.out.println("RollNumber is "+RollNumber);
System.out.println("Your Gender is "+str2);
System.out.println("Salary is "+f);
}
}