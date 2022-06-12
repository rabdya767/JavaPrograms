abstract class MyCls1
{
abstract void calculate(double x);
}

class Sub1 extends MyCls1
{
    public void calculate(double x)
    {
        System.out.println("Square of "+x+" is "+(x*x));
    }
}

class Sub2 extends MyCls1
{
    public void calculate(double x)
    {
        System.out.println("Square Root of "+x+" is "+(Math.sqrt(x)));
    }
}

class Sub3 extends MyCls1
{
    public void calculate(double x)
    {
        System.out.println("Cube  of "+x+" is "+(x*x*x));
    }
}

public class abscal 
{
    public static void main(String[] args) 
    {

        MyCls1 ref;
        Sub1 obj1=new Sub1();
        Sub2 obj2=new Sub2();
        Sub3 obj3=new Sub3();
        
        ref=obj1;
        ref.calculate(3);

        ref=obj2;
        ref.calculate(4);

        ref=obj3;
        ref.calculate(5);
        /**
        Sub1 obj1=new Sub1();
        Sub2 obj2=new Sub2();
        Sub3 obj3=new Sub3();

        obj1.calculate(3);
        obj2.calculate(4);
        obj3.calculate(5);
        */
    }
}
