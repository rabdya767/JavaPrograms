import java.util.*;
public class ArrayClsMtds
{
    public static void main(String[] args) 
    {
        int arr[]={7,4,5,2,9,0,6,8};
        System.out.println("Initial Array is");
        print(arr);

        Arrays.parallelSort(arr);
        print(arr);
        int ar1[]=arr.clone();

        System.out.println(Arrays.compare(arr, ar1));

        int ar2[]=new int[10];
        ar2[1]=5;
        ar2[2]=6;

        print(ar2);
        Arrays.fill(ar2,1);
        print(ar2);

        int arcopy[]=Arrays.copyOf(arr,arr.length);
        System.out.println("Copied Array is");
        print(arcopy);
        
        int ar3[]=arr.clone();
        Arrays.sort(ar3,3,7);
        print(ar3);

        if(Arrays.equals(arr, ar1))
        {
            System.out.println("Both arrays are EQUAL");
        }
        else
        {
            System.out.println("NOT EQUAL");
        }
        
        
        System.out.println("Binary Search ");
        Arrays.sort(arr);
        int pos=Arrays.binarySearch(arr,5);

        System.out.println(pos+1);
        

        System.out.println("Sort Withing a Range");
        Arrays.sort(arr,0,4);
        print(arr);


        Arrays.sort(arr);
        System.out.println("After Sorting Array is");
        print(arr);
    
    }
    public static void print(int arr[])
    {
        for(int i:arr)
        {
            System.out.print(i+"  ");
        }
        System.out.println();
    }
}