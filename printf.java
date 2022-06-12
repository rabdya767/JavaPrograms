public class printf
{
    public static void main(String[] args) 
    {
     int i=100;
     String s="RABDYA";
     char c='M';
     float f=(float)1005.183;
     boolean b=true;
     System.out.printf("Name is %s%nRollNumber is %d%nGender is %c%nSalary is %f%nWorking %b%n",s,i,c,f,b);   
     System.out.printf("In Octal %o%nIn HexaDecimal %x%n",i,i); 
    }
}