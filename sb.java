import java.lang.StringBuffer;
public class sb {
    public static void main(String[] args) {
        StringBuffer sb0=new StringBuffer("RAB");
        StringBuffer sb1=new StringBuffer("SANTHOSH ");
        sb0.append("DYA");
        System.out.println(sb0);
        sb0.insert(0,sb1);
        System.out.println(sb0);
        sb0.delete(8,9);
        System.out.println(sb0);
        sb0.reverse();
        System.out.println(sb0);
        System.out.println(sb1.length());
        
        System.out.println(sb1.indexOf("S"));
        System.out.println(sb1.lastIndexOf("S"));
        String x=sb1.substring(0);
        String y=sb1.substring(0,4);
        System.out.println(x+"\t"+y);

        System.out.println(sb1.capacity());
        }
    
}