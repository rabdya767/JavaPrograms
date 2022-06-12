import java.lang.reflect.Constructor;  
class NewInstanceExample1  
{  
String str="hello";  

}
public class objcrt2 {
public static void main(String args[])  throws Exception
{  
Constructor<NewInstanceExample1> obj =NewInstanceExample1.class.getConstructor();  
NewInstanceExample1 obj1 = obj.newInstance();  
System.out.println(obj1.str);  
}  
}    