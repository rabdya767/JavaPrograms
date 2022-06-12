import java.lang.Object;

class MyObj extends Object
{

@Override 
public String toString()
{
    return "MyObject";
}

@Override
public int hashCode()
{
    return 100;
}

public boolean equals(Object o)
{
    return this.hashCode()==o.hashCode();
}
}

public class Ovr
{
    public static void main(String[] args) {
        
        MyObj o1=new MyObj();
        MyObj o2=new MyObj();
        System.out.println(o1.equals(o2));
        System.out.println(o1.hashCode());
        System.out.println(o2.hashCode());        
    }
}