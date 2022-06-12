class Sample4
{
    private int x;
    Sample4()
    {
        this(40);
        this.access();
    }
    Sample4(int x)
    {
        this.x=x;
    }
    void access()
    {
        System.out.println("x = "+x);
    }
}


public class thiskw {
public static void main(String[] args) {
    
    Sample4 s=new Sample4();
    s.access();
}
    
}