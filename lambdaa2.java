@FunctionalInterface
interface myinter11
{
    int add(int a,int b,int c);
}

public class lambdaa2 {
    public static void main(String[] args) {
        myinter11 m=(x,y,z)->(x+y+z);
        int r=m.add(12, 34, 56);
        System.out.println(r);
    }
}
