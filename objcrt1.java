class NewInstanceExample  
{  
String str="hello";  
}

public class objcrt1
{
public static void main(String args[])  throws InstantiationException, IllegalAccessException
{  
//creating object of class  
@SuppressWarnings("deprecation")
NewInstanceExample obj= NewInstanceExample.class.newInstance();   
System.out.println(obj.str);          
}  
}