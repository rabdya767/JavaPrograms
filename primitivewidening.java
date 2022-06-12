public class primitivewidening {
 public static void main(String[] args) {
     //widening lower datatypes into higher datatypes
     //byte,short,char,int,long,float,double
     //lower<----------------------->higher
     byte b=67; 
     double d1=b;
     float f1=(float)b;
     long l=(long)b;
     int i=(int)b;
     char ch=(char)b;
     short s=(short)b;
  
  
      System.out.println("double -->"+d1);
      System.out.println("float  -->"+f1);
      System.out.println("long   -->"+l);
      System.out.println("int    -->"+i);
      System.out.println("char   -->"+ch);
      System.out.println("short  -->"+s);
      System.out.println("byte   -->"+b);
  
    }   
}