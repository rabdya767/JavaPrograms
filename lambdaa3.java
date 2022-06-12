@FunctionalInterface
interface myinter111
{
    public  void rev(String str);
}


public class lambdaa3 {

public  static void rev(String str)
{
    StringBuffer sb=new StringBuffer(str);
    sb.reverse();
System.out.println(sb);
}

public static void main(String[] args) {

    myinter111 obj=lambdaa3::rev;
    obj.rev("Hello");
}

}
