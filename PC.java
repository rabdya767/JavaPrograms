import java.io.*;;

class Prd extends Thread {
    OutputStream os;

    public Prd(OutputStream o) {
        os = o;
    }

    public void run() {
        int count = 1;
        while (true) {
            try {
                os.write(count);
                os.flush();
                System.out.println("Producer --> " + count);
                Thread.sleep(100);
                count++;
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

class Cns extends Thread {
    InputStream ins;

    public Cns(InputStream i) {
        ins = i;
    }

    public void run() {
        int x;
        while (true) {
            try {
                x = ins.read();
                System.out.println("Consumer --> " + x);
                System.out.flush();
                Thread.sleep(100);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

public class PC {
    public static void main(String[] args) throws IOException {

        PipedInputStream pis = new PipedInputStream();
        PipedOutputStream pos = new PipedOutputStream();

        pis.connect(pos);

        Prd p = new Prd(pos);
        Cns c = new Cns(pis);

        p.start();
        c.start();
    }
}