import java.io.FileReader;

public class Fw {

    public static void main(String[] args) {
        
        try{
            FileReader fin=new FileReader("File11.txt");
            int x;
            while((x=fin.read())!=-1)
            {
                System.out.print((char)x);
            }
            fin.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }

            /**
              byte b[]=new byte[fin.available()];
              fin.read(b);
              String str=new String(b);
              System.out.println(str);
              fin.close();
          }
        catch(Exception e)
         {
            System.out.println(e);
         }
        */
    }
}
