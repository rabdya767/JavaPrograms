class outer11
{
    static int x=11;
    int y=21;
    static class inner11
    {
        void Display()
        {
            System.out.println(x);
        }
    }
}
public class staticclass {
 public static void main(String[] args) {
     new outer11.inner11().Display();
 }   
}
