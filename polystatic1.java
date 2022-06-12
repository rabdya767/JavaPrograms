class AddPolystatic11
{
    static void add(int a,int b)
    {
        System.out.println("Sum of "+a+" and "+b+" is "+(a+b));
    }

    static void add(float a,int b)
    {
        System.out.println("Sum of "+a+" and "+b+" is "+(a+b));
    }
}


class AddPolystatic1 extends AddPolystatic11
{
    static void add(int a,int b)
    {
        //super.add(a,b);
        System.out.println((a-b));
    }

    static void add(float a,int b)
    {
        System.out.println(a-b);
    }
}
public class polystatic1 {
    public static void main(String[] args) {
    AddPolystatic1.add(4,5);
    AddPolystatic1.add(5.89f,67);
}
}