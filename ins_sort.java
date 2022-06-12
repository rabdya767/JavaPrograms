public class ins_sort {
    public static void main(String args[]) {
    
     int arr[]={3,8,1,5,4,9}; 
     for(int i:arr)
     {
         System.out.print(i+"\t");
     }  
     System.out.println();

     for(int i=1;i<arr.length;i++)
     {
        int temp=arr[i];
        int j=i-1;
        while(j>=0 && arr[j]>temp)
        {
            arr[j+1]=arr[j];
            j-=1;
        }
        arr[j+1]=temp;
     }

     for(int i:arr)
     {
         System.out.print(i+"\t");
     }  
     System.out.println();
    }
}