import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Fr {
    public static void main(String[] args) {
        try {
            FileWriter f = new FileWriter("File11.txt");
            String str1 = "PYTHON IS VERY SIMPLE TO LEARN";
            byte b[] = str1.getBytes();
            for (byte i : b) {
                f.write(i);
            }
            f.close();
        } catch (FileNotFoundException fe) {
            System.out.println(fe);
        } catch (IOException ie) {
            System.out.println(ie);
        }
        /**
         * try{ FileWriter f=new FileWriter("File.txt"); String str="JAVA IS
         * A PROGRAMMING LANGUAGE"; f.write(str.getBytes()); f.close(); }
         * catch(FileNotFoundException e) { System.out.println(e); } catch(IOException
         * ie) { System.out.println(ie); }
         */
    }
}