public class eqlcmp {
    public static void main(String[] args) 
    {
        String s1=new String("Hello World");
        String s2=new String("Hello World");
        String s3="Hello World";

        if(s1.equals(s2)){
            System.out.println("Equals Method compare content");
        }
        else{
            System.out.println("Equals Method don't compare content");
        }

        if(s1.equals(s3)){
            System.out.println("Equals Method compare content");
        }
        else{
            System.out.println("Equals Method don't compare content");
        }

        if(s1.compareTo(s2)==0){
            System.out.println("Cmp Method compare content");
        }
        else{
            System.out.println("Cmp Method don't compare content");
        }

        if(s1.compareTo(s3)==0){
            System.out.println("Cmp Method compare content");
        }
        else{
            System.out.println("Cmp Method don't compare content");
        }

    }    
}