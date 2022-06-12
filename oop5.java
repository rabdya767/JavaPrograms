class Person3
{
    protected String Name;
    protected int Age;

    Person3()
    {
      Name="RABDYA";
      Age=23;
    }

    Person3(String str,int i)
    {
      Name=str;
      Age=i;
    }


protected void talk()
    {
            System.out.println("My name is "+Name);
            System.out.println("My age is "+Age);
    }
}
public class oop5 {
public static void main(String[] args) {
 Person3 obj=new Person3();
 Person3 obj1=new Person3("RAJU",34);
 obj1.talk();
 obj.talk();   
}
}