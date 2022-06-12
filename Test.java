class Sample2
{
    int x=10;
    void display()
    {
        System.out.println(x);
    }
}

public class Test {
public static void main(String[] args) {
   Sample2 obj1=new Sample2();
   Sample2 obj2=new Sample2();
   ++obj1.x;
   obj2.x=obj2.x+50;
   System.out.print("X in object1 \t");
   obj1.display();
   System.out.print("X in object2 \t");
   obj2.display();
   
}    
}