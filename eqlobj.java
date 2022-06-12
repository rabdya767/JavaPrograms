class MyClass
{
    int x;
    MyClass(int x)
    {
        this.x=x;
    }

    static void printName(Object obj)
    {
        //Class c=obj.getClass();
        String name=obj.getClass().getName();
        System.out.println("The ClassName is "+name);
    }
}
public class eqlobj {
public static void main(String[] args) {
    MyClass obj1=new MyClass(10);

    /**MyClass obj2=new MyClass(10);

    Integer i1=new Integer(20);
    Integer i2=new Integer(20);
    
    if(obj1.equals(obj2))
    {
        System.out.println(obj1.x+"\t"+obj2.x+"\nMyClass objects are Equal");
    }
    else
    {
        System.out.println(obj1.x+"\t"+obj2.x+"\nMyClass objects are not Equal");
    }
    System.out.println();
    if(i1.equals(i2))
    {
        System.out.println(i1+"\t"+i2+"\nInteger objects are Equal");
    }
    else
    {
        System.out.println(i1+"\t"+i2+"\nInteger objects are not Equal");
    }
*/
    MyClass.printName(obj1);
}
}