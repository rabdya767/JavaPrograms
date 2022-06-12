class Sample_Exp4
{
static void demo()
{
    try
    {
        System.out.println("Inside A Static Method");
        throw new ArithmeticException("ArithMetic  Exception");
    }
    catch(NullPointerException ne)
    {
        ne.printStackTrace();
        System.out.println(ne);
    }
    catch(ArithmeticException ae)
    {
        ae.printStackTrace();
    }
}
}
public class exp4 
{
 public static void main(String[] args) 
 {
    Sample_Exp4.demo();  
 }   
}