public class bitwise {
    public static void main(String[] args) {
        int x=0b1010,y=0b0110,z;
        //int x=10,y=6,z;
        z=x&y;//All are True then return True
        System.out.println(z);
        z=x|y;//Any of one is True then return True
        System.out.println(z);
        z=x^y;//Odd number of 1's return True
        System.out.println(z);
    }
}