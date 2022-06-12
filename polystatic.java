class AddPolystatic
{
    static void add(int a,int b)
    {
        System.out.println("Sum of "+a+" and "+b+" is "+(a+b));
    }

    static void add(float a,int b)
    {
        System.out.println("Sum of "+a+" and "+b+" is "+(a+b));
    }

    static void add(float a,float b)
    {
        System.out.println("Sum of "+a+" and "+b+" is "+(a+b));
    }

    static void add(int a,float b)
    {
        System.out.println("Sum of "+a+" and "+b+" is "+(a+b));
    }
}

public class polystatic {
    public static void main(String[] args) {
    AddPolystatic.add(4,5);
    AddPolystatic.add(5.89f,6.45f);
    AddPolystatic.add(5.89f,67);
    AddPolystatic.add(5,67.98f);
}
}