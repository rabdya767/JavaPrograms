abstract class Plan
{
    protected double rate;
    abstract void getRate();
    public void calculateBill(int units)
    {
    System.out.println("Bill Amounts for "+units+" units : "+(units*rate));

    }
}

class DomesticElc extends Plan
{
    public void getRate()
    {
        rate=2.5;
    }
}

class CommercialElc extends Plan
{
    public void getRate()
    {
        rate=5.0;
    }
}

public class calElecBill 
{
public static void main(String[] args) 
{
    Plan ref;
    DomesticElc dobj=new DomesticElc();
    CommercialElc cobj=new CommercialElc();

    System.out.println("*****Domestic*****");
    ref=dobj;
    ref.getRate();
    ref.calculateBill(100);

    System.out.println("*****Commercial*****");
    ref=cobj;
    ref.getRate();
    ref.calculateBill(100);
}    
}