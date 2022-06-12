import java.text.NumberFormat;

public class AreaCircle 
{public static void main(String[] args) {
    final double PI=(double)22/7;
    double r=15.5;
    double Area=PI*r*r;
    System.out.println("Area is "+Area);
    NumberFormat obj=NumberFormat.getInstance();
    obj.setMaximumFractionDigits(2);
    obj.setMinimumIntegerDigits(6);
    String str=obj.format(Area);
    System.out.println("Formatted Area is "+str);

}
}