class outer
{
    int x=10;
    
    class inner
    {
        int y=20;
        public void innerDisplay()
        {
            System.out.println("Inner Class" );
            System.out.println("Outer Class Var "+x+"\nInner Class Var "+y);
        }
    }

    void outerDisplay()
    {
        inner obj=new inner();
        obj.innerDisplay();
        System.out.println("Outer Class");
        System.out.println("Outer Class Var "+x+"\nInner Class Var "+obj.y);
    }
}
public class nestedinner {
 public static void main(String[] args) {
     outer obj=new outer();
     obj.outerDisplay();

     outer.inner obj1=new outer().new inner();
     obj1.innerDisplay();
 }   
}