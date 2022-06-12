import java.util.Scanner;
import java.lang.StringBuffer;
public class revstr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String ip_str,temp,rev_str;
        System.out.println("Enter the String??");
        ip_str=sc.nextLine();
        temp=ip_str;
        StringBuffer sb=new StringBuffer(ip_str);
        rev_str=(sb.reverse()).toString();
        sc.close();
        System.out.println("Reverse of "+ip_str+" is "+rev_str);

        if(temp.equalsIgnoreCase(rev_str))
        {
            System.out.println("Given String is Palindrome");
        }
        else{
            System.out.println("Not a Palindrome");    
        }
    }
}