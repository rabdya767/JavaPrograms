/**
 * @RABDYA_SANTHOSH
 * ?twitter--> https://twitter.com/rabdya_767
 * !nstagram-->https://www.instagram.com/santhosh_rabdya/
 */

abstract class Shape1 {
    abstract void perimeter();
    abstract void  area();
}


class Circle1 extends Shape1
{
    int r;
    Circle1(int r)
    {
        this.r=r;
    }

    void perimeter()
    {
        System.out.println("Circle Perimeter is "+2*Math.PI*r);
    }

    void area()
    {
        System.out.println("Circle Area is "+Math.PI*r*r);
    }

}

class Rectangle1 extends Shape1
{
    int l,b;
    Rectangle1(int l,int b)
    {
        this.l=l;
        this.b=b;
    }

    void perimeter()
    {
        System.out.println("Rectangle Perimeter is "+2*(l+b));
    }

    void area()
    {
        System.out.println("Rectangle Area is "+l*b);
    }
}

public class abscls1 {

    public static void main(String[] args) {
        
        Circle1 obj1=new Circle1(7);
        Rectangle1 obj2=new Rectangle1(5, 4);

        obj1.area();
        obj1.perimeter();

        obj2.area();
        obj2.perimeter();
    }
}