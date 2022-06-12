public class format
{
    public static void main(String[] args) 
    {
     int i=100;
     String s="RABDYA";
     char c='M';
     float f=(float)1005.183;
     boolean b=true;
     String str=String.format("Name is %s%nRollNumber is %d%nGender is %c%nSalary is %f%nWorking %b%n",s,i,c,f,b);
     String str1=String.format("In Integer %d%nIn Octal %o%nIn HexaDecimal %x%n",i,i,i); 
     System.out.println(str);
     System.out.printf("%s%n",str1);
    }
}