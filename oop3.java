class Person1
{
    String Name="RABDYA";
    int Age=23;
    protected void talk()
    {
            System.out.println("My name is "+Name);
            System.out.println("My age is "+Age);
    }
}
public class oop3 {
public static void main(String[] args) {
 Person1 obj=new Person1();
 obj.Name="RAJU";
 obj.Age=32;
 obj.talk();   
}
}