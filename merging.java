public class merging
{
    public static void main(String[] args) 
    {
        byte a=9,b=12;//a=1001 b=1100
        byte c=(byte)(a<<4);//c=10010000(Masking)
        c=(byte)(c|b);//c=1001110(Masking)
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);//Merging 
        System.out.println((c&0b11110000)>>4);//Gives a
        System.out.println((c&0b00001111));//Gives b
    }
}