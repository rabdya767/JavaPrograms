public class filter1 {
    public static void main(String[] args) 
    {
        int arr[]={12,-76,57,-96,97,-75,0,45,-87,88};
        for(int i:arr)
        {
            if((i%2)!=0)
            {
                continue;
            }
            System.out.println(i);
        }
    }    
    }