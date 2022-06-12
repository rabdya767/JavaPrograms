class PolyOvrRdng
{
    void add(int a,int b)
    {
        System.out.println("Sum of "+a+" and "+b+" is "+(a+b));
    }

    void add(float a,int b)
    {
        System.out.println("Sum of "+a+" and "+b+" is "+(a+b));
    }
}

class PolyOvrRdngextends extends PolyOvrRdng
{
    void add(int a,int b)
    {
      //super.add(a, b);
        System.out.println((a+b));
    }

    void add(float a,int b)
    {
      //super.add(a, b);
        System.out.println((a+b));
    }
}


public class ploy3
{
    public static void main(String[] args) {
    PolyOvrRdngextends polyobj=new PolyOvrRdngextends();
    polyobj.add(4,5);
    polyobj.add(5.89f,6);
}
}