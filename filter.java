public class filter {
    public static void main(String[] args) 
    {
        int arr[]={12,-76,57,-96,97,-75,0};
        for(int i:arr)
        {
            if(i<0)
            {
                continue;
            }
            System.out.println(i);
        }
    }    
    }