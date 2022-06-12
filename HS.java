import java.util.*;

public class HS
{
public static void main(String[] args)  throws Exception
    {
        HashSet<String> hs=new HashSet<String>();
        HashSet<String> hs1=new HashSet<String>(15);
        HashSet<String> hs2=new HashSet<String>(100,0.75f);

        System.out.println("Size of HashSet1 is "+hs1.size());
        System.out.println("Size of HashSet1 is "+hs2.size());
        System.out.println("HashSet 1 is Empty "+hs1.isEmpty());
        hs.add("RR");
        hs.add("SRH");
        hs.add("DC");
        hs.add("RCB");
        hs.add("CSK");
        hs.add("MI");
        hs.add("KKR");
        hs.add("PBKS");
        System.out.println("HashSet = "+hs);

        System.out.println(hs.size());
        //hs.clear();
        hs.remove("DC");
        hs.remove("RR");

        System.out.println(hs.contains("GL"));
        System.out.println(hs.size());

        for(String S:hs)
        {
            System.out.print(S+"\t");
        }


        //System.out.println("\n"+hs.getClass());

        /**
        Iterator<String> it=hs.iterator();
        System.out.println("Element Using Iterator");
        while(it.hasNext())
        {
            String s=(String)it.next();
            System.out.print(s+"\t");
        }

        it.remove();
        System.out.println("HashSet = "+hs);
        System.out.println("HashSet = "+hs);
        */
        
    }
}