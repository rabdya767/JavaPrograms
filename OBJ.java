import java.text.NumberFormat;
class CrclArea 
{
    double r;

    public CrclArea()
    {
        r=15.5;
    }

    public CrclArea(double r)
    {
        this.r=r;
    }
    void AreaCircle()
    {
    final double PI=(double)22/7;
    double Area=PI*r*r;
    System.out.println("Area is "+Area);
    NumberFormat obj=NumberFormat.getInstance();
    obj.setMaximumFractionDigits(2);
    obj.setMinimumIntegerDigits(6);
    String str=obj.format(Area);
    System.out.println("Formatted Area is "+str);
    System.out.println("******************************");
}
}

public class OBJ {
    public static void main(String[] args)  throws ClassNotFoundException,InstantiationException,IllegalAccessException,CloneNotSupportedException{
        CrclArea obj1=new CrclArea(7);
        //Class obj2=Class.forName("CrclArea");
        @SuppressWarnings("deprecation")
        CrclArea obj3=(CrclArea)Class.forName("CrclArea").newInstance();
        obj1.AreaCircle();
        obj3.AreaCircle();
    }
}