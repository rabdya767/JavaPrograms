public class sel_sort {
    public static void main(String args[]) {
    
     int arr[]={3,8,1,5,4,9}; 
     for(int i:arr)
     {
         System.out.print(i+"\t");
     }  
     System.out.println();
 
     for(int i=0;i<arr.length-1;i++)
     {
        int min=i;
        for(int j=i+1;j<arr.length;j++)
        {
            if(arr[min]>arr[j])
            min=j;
        }
        if(min!=i)
        {
            arr[i]=arr[min]^arr[i];
            arr[min]=arr[min]^arr[i];
            arr[i]=arr[min]^arr[i];
        }
     }
     for(int i:arr)
     {
         System.out.print(i+"\t");
     }  
     System.out.println();
 
    }
}