interface rabdya
{
    public void method1();
    public void method2();

}

class int_class implements rabdya
{

@Override
public void method1()
{
System.out.println("Method 1");
}

@Override
public void method2()
{
System.out.println("Method 2");
}

public void method3()
{
System.out.println("Method 3");
}

} 


public class interf1 {
 public static void main(String[] args) {
     int_class obj=new int_class();
     rabdya obj2=new int_class();
     obj2.method1();
     obj2.method2();
     obj.method3();
     obj.method1();
     obj.method2();
 }   
}