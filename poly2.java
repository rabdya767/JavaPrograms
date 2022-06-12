class AddPoly
{
    void add(int a,int b)
    {
        System.out.println("Sum of "+a+" and "+b+" is "+(a+b));
    }

    void add(float a,int b)
    {
        System.out.println("Sum of "+a+" and "+b+" is "+(a+b));
    }

    void add(float a,float b)
    {
        System.out.println("Sum of "+a+" and "+b+" is "+(a+b));
    }

    void add(int a,float b)
    {
        System.out.println("Sum of "+a+" and "+b+" is "+(a+b));
    }
}

public class poly2 {
    public static void main(String[] args) {
    AddPoly polyobj=new AddPoly();
    polyobj.add(4,5);
    polyobj.add(5.89f,6.45f);
    polyobj.add(5.89f,67);
    polyobj.add(5,67.98f);
}
}