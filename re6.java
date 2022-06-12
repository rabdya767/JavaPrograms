import java.util.Scanner;
import java.util.regex.Pattern;
public class re6
{
    public static void main(String[] args) 
    {
               Scanner sc=new Scanner(System.in);
               System.out.println("Enter A number? ");
               String str=sc.nextLine();
               sc.close();
/**
               if(str.matches("[01]+"))
               {
                   System.out.println("Binary");
               }
               else if(str.matches("[0-7]+"))
               {
                System.out.println("Octal");
               }
               else if(str.matches("[0-9]+"))
               {
                System.out.println("Decimal");
               }
               else if(str.matches("[0-9A-F]+"))
               {
                System.out.println("HexaDecimal");
               }
               else
               {
                 System.out.println("Invalid");
               }    
               System.out.println(str.matches("A"));  
*/
               if(Pattern.matches("[01]+",str))
               {
                   System.out.println("Binary");
               }
               else if(Pattern.matches("[0-7]+",str))
               {
                System.out.println("Octal");
               }
               else if(Pattern.matches("[0-9]+",str))
               {
                System.out.println("Decimal");
               }
               else if(Pattern.matches("[0-9A-F]+",str))
               {
                System.out.println("HexaDecimal");
               }
               else
               {
                 System.out.println("Invalid");
               }    
            }

}