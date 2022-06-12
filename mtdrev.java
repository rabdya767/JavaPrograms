public class mtdrev {

 static void Rev(String str)
 {
     StringBuffer sb=new StringBuffer(str);
     System.out.println(sb.reverse());
 }

 static void Rev(int i)
 {
    StringBuffer s=new StringBuffer(""+i);
    System.out.println("\n"+s.reverse());


 }
 
 static void Rev(int A[])
 {
     for(int i=A.length-1;i>=0;i--)
     {
         System.out.print(A[i]+"\t");
     }
 }

 public static void main(String[] args) {
     String str="QWERTY";
     int A[]={1,2,3,4,5,6,7};
     int i=5768;
     Rev(str);
     Rev(A);
     Rev(i);
 }   
}