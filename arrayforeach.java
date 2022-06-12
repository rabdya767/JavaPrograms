public class arrayforeach {
    public static void main(String[] args) {
        int array[]={12,98,-17,75,17};
/**
* 
* 
*      int array[][] = { { 11, 4, 17 }, { 17, 15, 1 }, { -8, 15, 6 } };
*      for(int x[]:array)
*          {
*             for(int j:x)
*             {
*                  System.out.printf("%03d\t",j);
*             }
*             System.out.println();
*         }
*/
            java.util.Arrays.sort(array);
            for(int x:array)
            {
            System.out.println(x);
            }
            System.out.println("***********");
            System.out.println(java.util.Arrays.binarySearch(array, 13));
    }
}