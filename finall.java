class A
{
    final  void mtd1()
    {
        System.out.println("Hello from Super Class ");
    }
}

class B extends A
{
     void mtd2()
    {
        //A.mtd1();
        System.out.println("Hello from Sub Class ");
    }
}
public class finall {
 public static void main(String[] args) {
     B objb=new B();
     objb.mtd2();
 }   
}