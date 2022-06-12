import java.lang.Math;
public class MathMtd 
{
    public static void main(String[] args) 
    {
        System.out.println(Math.sin(0.5));
        System.out.println(Math.cos(0.5));
        System.out.println(Math.tan(0.5));
        System.out.println(Math.log(0.5));
        System.out.println(Math.log10(0.5));
        System.out.println(Math.pow(5,3));
        System.out.println(Math.sqrt(25)+"\n"+Math.abs(-4.55)+"\n"+
        Math.ceil(4.5)+"\n"+Math.floor(4.5)+"\n"+
        Math.round(4.6)+"\n"+Math.round(4.4)+Math.random());
        System.out.println(Math.toRadians(180));
        System.out.println(Math.toDegrees(3.141592653589793));

        System.out.println(Math.E+"\n"+Math.PI+"\n"+Math.min(5,10)+"\n"+Math.max(5,10));


    }   
}