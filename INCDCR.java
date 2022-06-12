public class INCDCR {
    public static void main(String[] args) {
        int x = 5, y = 9, z = 10;
        System.out.println(x);
        x++;
        System.out.println(++x);
        System.out.println(x++);
        System.out.println(x);
        System.out.println(++y * y++);
        System.out.println(z++ * ++z);

        int x1 = 8, y1 = 5, z1 = 10;
        System.out.println(x1);
        x1--;
        System.out.println(--x1);
        System.out.println(x1--);
        System.out.println(x1);
        System.out.println(--y1 * y1--);
        System.out.println(z1-- * --z1);
    }
}