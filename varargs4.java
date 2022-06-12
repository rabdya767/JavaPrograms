import java.lang.Integer;
public class varargs4 
{
    static void max(int ... X)
    {
    if(X.length==0)
    {
        System.out.println(Integer.MIN_VALUE);
        System.exit(1);
    }
    if(X.length==1)
    {
        System.out.println(X[0]);
    }

    int min=X[0];
    for(int i=1;i<X.length;i++)
    {
        if(X[i]>min)
        {
            min=X[i];
        }
    }
    System.out.println(min);
    }
    public static void main(String[] args) {
        int x[]={12,34,56,78,89};
        //max();
        max(new int[]{10});
        max(x);
        max(new int[]{10,20,30});
        max(new int[]{10,20,30,40,50});
    }
}