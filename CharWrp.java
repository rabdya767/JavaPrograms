import java.io.*;
public class CharWrp
{
    @SuppressWarnings("deprecation")
    public static void main(String[] args) throws IOException
    {
        char Ch='R';
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter A char"); 
        char Ch1=br.readLine().charAt(0);
        System.out.println(Ch);        
        System.out.println(Ch1);

        Character chobj1=new Character(Ch);
        Character chobj2=new Character(Ch1);
        /**
         * System.out.println(chobj1);
         * System.out.println(chobj2);
         * 
         *  
         */
        //Character Obj to primitive(char)
        System.out.println(chobj1.charValue());
        System.out.println(chobj2.charValue());
        //Character Obj to String
        System.out.println(chobj1.toString());
        System.out.println(chobj2.toString());
    }
}