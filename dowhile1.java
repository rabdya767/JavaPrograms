public class dowhile1 
{
    public static void main(String args[])
    {
        int x=1,z=5,sum=0;
        do{
            System.out.println(z+" * "+x+" = "+(z*x));
            x++;
            sum+=(z*x);
        }while(x<=10);
        System.out.println("Sum is "+sum);
    }
    
}
