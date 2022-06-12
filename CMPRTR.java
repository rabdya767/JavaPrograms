import java.util.*;
import java.lang.Integer;

class AO implements Comparator<Integer>
{
    public int compare(Integer i1,Integer i2)
    {
        return i1.compareTo(i2);
    }
}

class DO implements Comparator<Integer>
{
    public int compare(Integer i1,Integer i2)
    {
        return i2.compareTo(i1);
    }
}

public class CMPRTR {
public static void main(String[] args) {
    
    Integer arr[]={7,4,5,2,9,0,6,8};
    
    System.out.println("Normal Sort");
    Arrays.sort(arr);
    print(arr);

    System.out.println("In Descending Order");
    Arrays.sort(arr,new DO());
    print(arr);

    System.out.println("In Ascending Order");
    Arrays.sort(arr,new AO());
    print(arr);

}
  public static void print(Integer arr[])
    {
        for(Integer i:arr)
        {
            System.out.print(i+"  ");
        }
        System.out.println();
    }

}    