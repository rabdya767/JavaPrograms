public class varargs 
{
    static void show(int ... X)
    {
        int sum=0;
        for(int i:X)
        {
            sum+=i;
            System.out.print(i+"\t");
        }
        System.out.println("\nSum is "+sum);
    }
    public static void main(String[] args) {
        show();
        show(10);
        show(10,20);
        show(10,20,30);
        show(10,20,30,40);
    }
}