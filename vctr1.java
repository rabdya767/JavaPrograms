import java.util.*;
import java.lang.Integer;
public class vctr1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the No.of Elements in the Array? ");
        int n=sc.nextInt();
        int Array[]=new int[n];
        Vector<Integer>vc=new Vector<Integer>();
        for(int i=0;i<n;i++)
        {
            System.out.print("Enter the "+(i+1)+" Element of the Arrray : ");
            Array[i]=sc.nextInt();
            vc.add(Array[i]);   
        }

        System.out.println("Vector Elements are ");
            for(int i=0;i<vc.size();i++)
            {
                System.out.print(vc.get(i)+" ");
            }

        ListIterator<Integer>lit=vc.listIterator();
        
        System.out.println("USING LIST ITERATOR");
        System.out.println("\n\n\nIn Forward Direction \n\n");
        while(lit.hasNext())
        {
            System.out.print(lit.next()+"\t");
        }

        System.out.println("\n\n\nIn Backward Direction \n\n");
        while(lit.hasPrevious())
        {
            System.out.print(lit.previous()+"\t");
        }

        System.out.println("\n\n\nUSING ENUMERATION\n\n");
        Enumeration<Integer>en=Collections.enumeration(vc);
        while(en.hasMoreElements())
        {
            System.out.print(en.nextElement()+"\t");
        }
        sc.close();
    }
}