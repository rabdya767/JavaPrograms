class Sample3
{
    static int x=10;
    static void display()
    {
        System.out.println(x);
    }
}

public class Test1 {
public static void main(String[] args) {
    ++Sample3.x;
    Sample3.x=Sample3.x+50;
    System.out.print("X in object1 \t");
    Sample3.display();
    System.out.print("X in object2 \t");
    Sample3.display();
    /**Sample3 obj1=new Sample3();
   Sample3 obj2=new Sample3();
   ++obj1.x;
   obj2.x=obj2.x+50;
   System.out.print("X in object1 \t");
   obj1.display();
   System.out.print("X in object2 \t");
   obj2.display();
   */
}    
}