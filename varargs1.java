public class varargs1 
{
    static void show(int ... X)
    {
    //  int sum=0;
        for(int i:X)
        {
        //  sum+=i;
            System.out.print(i+"\t");
        }
    //  System.out.println("Sum is "+sum);
        System.out.println("\n");
    }
    public static void main(String[] args) {
        int x[]={12,34,56,78,89};
        show();
        show(new int[]{10});
        show(x);
        show(new int[]{10,20,30});
        show(new int[]{10,20,30,40,50});
    }
}