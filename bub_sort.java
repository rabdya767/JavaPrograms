public class bub_sort {
public static void main(String args[]) {

 int arr[]={3,8,1,5,4,9}; 
 for(int i:arr)
 {
     System.out.print(i+"\t");
 }  
 System.out.println();

 for(int i=0;i<arr.length;i++)
 {
     for(int j=i;j<arr.length;j++)
     {
        if(arr[i]>arr[j])
        {
            arr[i]=arr[i]^arr[j];
            arr[j]=arr[i]^arr[j];
            arr[i]=arr[i]^arr[j];
        }
     }
 }
 for(int i:arr)
 {
     System.out.print(i+"\t");
 }  
 System.out.println();
}    
}