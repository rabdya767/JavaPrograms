class MYCLS
{
    void calculate(double x)
    {
        System.out.println("The Square of "+x+" is "+(x*x));
    }
}

public class UseCalculate
{
    public static void main(String[] args) 
    {
        MYCLS obj=new MYCLS();
        MYCLS obj1=new MYCLS();
        MYCLS obj2=new MYCLS();
        obj.calculate(3);
        obj1.calculate(4);
        obj2.calculate(5);

    }
}