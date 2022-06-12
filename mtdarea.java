public class mtdarea {
    static int area(int x)
    {
        return x*x;
    }

    static int area(int x,int y)
    {
        return x*y;
    }

    static float area(float x)
    {
        return (float)Math.PI*x*x;
    }

    public static void main(String[] args) {
        int l=5,b=6,a=10;
        float r=7.00f;
        System.out.println("Area of Circle is "+area(r));
        System.out.println("Area of RectAngle is "+area(l,b));
        System.out.println("Area of Square is "+area(a));
    }
}