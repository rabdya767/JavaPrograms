import java.util.LinkedList;
import java.lang.Integer;

public class LL
{
    public static void main(String[] args) 
    {
        LinkedList<Integer>ll=new LinkedList<Integer>();
        ll.add(123);
        ll.add(0,456);
        ll.add(980);
        ll.addFirst(878);
        ll.addLast(980);
        ll.set(3,321);
        System.out.println(ll.get(2));
        System.out.println(ll.getFirst());
        System.out.println(ll.getLast());
        System.out.println(ll.size());
        System.out.println(ll.indexOf(456));
        System.out.println(ll.lastIndexOf(980));
        System.out.println(ll.remove(2));
        System.out.println(ll.removeFirst());
        System.out.println(ll.removeLast());
        Object obj[]=ll.toArray();
        for(Object i:obj)
        {
            System.out.print(i+"\t");
        }
        ll.clear();

        /**
        for(int i:ll)
        {
            System.out.print(i+"\t");
        }
        */
    }
}