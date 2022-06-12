public class swapbitwise {
    public static void main(String[] args) {
        int a=9;
        int b=12;
        System.out.println("Before swapping");
        System.out.println(a);
        System.out.println(b);
        a=a^b;//a=a+b;
        b=a^b;//b=a-b;
        a=a^b;//a=a-b;
        System.out.println("After swapping");
        System.out.println(a);
        System.out.println(b);
    }  
  }