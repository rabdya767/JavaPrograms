import java.io.IOException;
import java.io.RandomAccessFile;

public class RAF {
    public static void main(String[] args) throws IOException {
        
        RandomAccessFile rf=new RandomAccessFile("File.txt", "rw");

        System.out.print((char)rf.read());
        System.out.print((char)rf.read());
        rf.skipBytes(3);
        System.out.print((char)rf.read());
        rf.write('d');
        System.out.print((char)rf.read());
        System.out.print((char)rf.read());
        rf.write('g');

        rf.close();


    }
}
