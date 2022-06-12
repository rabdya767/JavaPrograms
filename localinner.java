class Outer1
{
    public void Outer_display()
    {
        class Inner1
        {
            void Inner_Display()
            {
                System.out.println("Hello");
            }
        }
        //Inner1 obj=new Inner1();
        //obj.Inner_Display();
        new Inner1().Inner_Display();
    }
}


public class localinner {
public static void main(String[] args) {
    Outer1 obj=new Outer1();
    obj.Outer_display();
    //new Outer1().Outer_display();
}    
}
