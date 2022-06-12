import java.util.*;
import java.lang.Integer;

public class HS1
{
    public static void main(String[] args)
    {
        HashSet<Integer>hs=new HashSet<Integer>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter No Of Elements? ");
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter an Integer ");
            hs.add(sc.nextInt());
        }
        //System.out.println(hs);
        sc.close();
        Iterator<Integer> it=hs.iterator();
        while(it.hasNext())
        {
            Integer i=it.next();
            System.out.print(i+"\t");
        }
    }
}