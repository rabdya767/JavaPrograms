public class mtd1 
{
    int max(int x)
    {
        return x;
    } 
    static float max(float x,float y)
   {
       return (x>y)?x:y;
   } 

   static int max(int x,int y,int z)
   {
       return (x>y &&x>z)?x:((y>z)?y:z);
   }

public static void main(String[] args) {
    mtd1 obj=new mtd1();
    System.out.println("Max is "+mtd1.max(12.78f,15.65f));
    System.out.println("Max is "+max(12,15,34));
    System.out.println("Max is "+obj.max(15));
}
}