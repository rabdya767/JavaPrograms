class Shape
{
    protected double l;
    Shape(double l)
    {
        this.l=l;
    }
}

class Square extends Shape
{
    Square(double l)
    {
        super(l);
    }

    void area()
    {
        System.out.println("areaOfSquareIs "+(l*l));
    }
}

class Rectangle extends Square
{
    private double b;
    Rectangle(double x,double y)
    {
        super(x);
        b=y;
    }

    void area()
    {
        System.out.println("areaOfRectAngleIs "+(l*b));
    }
}

public class inh5 {
 public static void main(String[] args) {
     Square s=new Square(5.00);
     s.area();
     Rectangle r=new Rectangle(5.00,6.00);
     r.area();
 }   
}