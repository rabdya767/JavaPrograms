public class stripp 
{
    public static void main(String[] args) 
    {
        char arr[]=new char[10];
        byte arr2[]=new byte[30];
        String s1="  UNIVERCITY  ";
        String s2= "  rabdya";
        String s3="santhosh   ";
        System.out.println(s1.strip());
        System.out.println(s1.stripLeading());
        System.out.println(s2);
        System.out.println(s3.stripTrailing());
        System.out.println();
        
        arr2=s3.getBytes();//Gives Their ASCII value

        for(byte b:arr2)
        {
        System.out.println(b);
        }

        s1.getChars(8, 12, arr, 0);
        for(char x:arr)
        {
        System.out.print(x);
        }
    }   
}