class Person2
{
    private String Name="RABDYA";
    private int Age=23;
    protected void talk()
    {
            System.out.println("My name is "+Name);
            System.out.println("My age is "+Age);
    }
}
public class oop4 {
public static void main(String[] args) {
 Person1 obj=new Person1();
 Person1 obj1=new Person1();
 obj1.talk();
 obj.talk();   
}
}