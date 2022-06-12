public class primitivenarrowing {
 public static void main(String[] args) {

    //Narrowing higher datatypes into lower datatypes
    //byte,short,char,int,long,float,double
    //lower<----------------------->higher
   double d1=97.45;
   float f1=(float)d1;
   long l=(long)d1;
   int i=(int)d1;
   char ch=(char)d1;
   byte b=(byte)d1;
   short s=(short)d1;


    System.out.println("double -->"+d1);
    System.out.println("float  -->"+f1);
    System.out.println("long   -->"+l);
    System.out.println("int    -->"+i);
    System.out.println("char   -->"+ch);
    System.out.println("short  -->"+s);
    System.out.println("byte   -->"+b);

}   
}