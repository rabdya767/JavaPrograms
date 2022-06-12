class Sample1
{
    int x;
    static int y=12;
    Sample1(int x)
    {
        this.x=x;
    }
    static void access()
    {
      //  System.out.println("Instance X = "+x);
        System.out.println("Static Y = "+y);
    }
}

public class staticc1 {
public static void main(String[] args) {
   // Sample1 obj=new Sample1(41);
    Sample1.access();
}    
}