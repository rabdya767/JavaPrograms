class rlt1
{
    int x;
    rlt2 t;
    rlt1(rlt2 t)
    {
        this.t=t;
        x=10;
    }
 void display()
 {
    System.out.println("One's x "+x);
    t.display();
    System.out.println("Two's y from One's "+t.y);
 
}
}

class rlt2
{
    int y;
    rlt2(int y)
    {
        this.y=y;
    }
void display()
 {
    System.out.println("Two's y is "+y);
 }
}

public class Relate {
public static void main(String[] args) {
    rlt2 obj2=new rlt2(22);
    rlt1 obj1=new rlt1(obj2);
    obj1.display();
    //obj2.display();
}
}