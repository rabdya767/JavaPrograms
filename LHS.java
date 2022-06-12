import java.util.HashSet;
import java.util.LinkedHashSet;
import java.lang.Integer;
public class LHS
{
    public static void main(String[] args) 
    {
        LinkedHashSet<Integer>lhs=new LinkedHashSet<Integer>();
        lhs.add(222);
        lhs.add(444);
        lhs.add(666);
        lhs.add(888);

        HashSet<Integer>hs=new HashSet<>();
        hs.add(111);
        hs.add(333);
        hs.add(555);
        hs.add(777);


        lhs.addAll(hs);

        System.out.println(hs+"\n"+hs.getClass());
        System.out.println(lhs+"\n"+lhs.getClass());
    }
}