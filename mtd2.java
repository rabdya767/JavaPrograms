public class mtd2 {
    static int change_int(int x)
    {
        return x=x*x;
    }
    static int change_arr(int A[])
    {
        return A[0]=112233;
    }

    public static void main(String[] args) {
        int x=10;
        int A[]={12,56,78,90};
        System.out.println("Before Mtd Calling ");
        System.out.println(x);
        for(int i:A)
        {
            System.out.println(i);
        }
        System.out.println("**********************");
        System.out.println(change_int(x));
        System.out.println(change_arr(A));
        System.out.println("**********************");

        System.out.println("After Mtd Calling ");
        System.out.println(x);
        for(int i:A)
        {
            System.out.println(i);
        }
        System.out.println("**********************");
    }   
}