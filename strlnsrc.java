import java.util.*;
public class strlnsrc {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the no.of Cities?");
    int n=sc.nextInt();
    String str[]=new String[n+1];
    System.out.println("Enter "+n+"  Strings");
    for(int i=0;i<n+1;i++)
    {
        str[i]=sc.nextLine();
    }
    System.out.println("Enter the Search string??");
    String srch=sc.nextLine();
    
    boolean found=false;
    for(int i=0;i<n+1;i++)
    {
        if(srch.equals(str[i]))
        {
            System.out.println("City "+srch+" Found at Position "+(i));
            found=true;
            break;
        }
        else
        continue;
    }
    if(!found)
    {
        System.err.println("Not Found");
    }
    sc.close();
}   
}