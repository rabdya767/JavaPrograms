import java.io.BufferedReader;
import java.io.FileReader;

public class markreset
{
    public static void main(String[] args) throws Exception{
        FileReader fin=new FileReader("final.txt");
        BufferedReader br=new BufferedReader(fin);

        System.out.print((char)br.read());
        System.out.print((char)br.read());
        System.out.print((char)br.read());
        br.mark(5);
        System.out.print((char)br.read());
        System.out.print((char)br.read());
        br.reset();
        System.out.print((char)br.read());
        System.out.print((char)br.read());
        br.close();

    }
}