import java.lang.Class;
import java.lang.Integer;
import java.lang.annotation.Annotation;

public class rfx {
 public static void main(String[] args) {
     Class c=Integer.class;

     Annotation cn[]=c.getAnnotations();
     for(Annotation x:cn)
     {
         System.out.println(x);
     }


/**
 * 
     Constructor cn[]=c.getConstructors();
     for(Constructor x:cn)
     {
         System.out.println(x);
     }

     
     Field f[]=c.getFields();
     for(Field x:f)
     {
         System.out.println(x);
     }

     System.out.println(c.getName());
 */
 }   
}
