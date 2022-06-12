public class switch1 
{
public static void main(String[] args) 
{
    char color='G';
    switch(color)//Any Datatype other than String
    {
        case 'B':
                System.out.println("Blue");
                break;
        case 'G':
                System.out.println("Green");
                break; 
        case 'R':
                System.out.println("Red");
                break; 
        case 'V':
                System.out.println("Violet");
                break;
        default:
                System.out.println("No Color");
                break;      

    }
}    
}
