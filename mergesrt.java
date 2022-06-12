import java.io.*;
import java.lang.Integer;
class mergesrt
{
	void merge(int arr[], int l, int m, int r)
	{
		int n1 = m - l + 1;
		int n2 = r - m;
		int L[] = new int[n1];
		int R[] = new int[n2];
		for (int i = 0; i < n1; ++i)
			L[i] = arr[l + i];
		for (int j = 0; j < n2; ++j)
			R[j] = arr[m + 1 + j];
		int i = 0, j = 0;
		int k = l;
		while (i < n1 && j < n2) {
			if (L[i] <= R[j]) {
				arr[k] = L[i];
				i++;
			}
			else {
				arr[k] = R[j];
				j++;
			}
			k++;
		}
		while (i < n1) {
			arr[k] = L[i];
			i++;
			k++;
		}
		while (j < n2) {
			arr[k] = R[j];
			j++;
			k++;
		}
	}
	void sort(int arr[], int l, int r)
	{
		if (l < r) {
			int m =l+ (r-l)/2;
			sort(arr, l, m);
			sort(arr, m + 1, r);
			merge(arr, l, m, r);
		}
	}

	static void printArray(int arr[])
	{
		for (int i:arr)
			System.out.format("%02d\t",i);
		System.out.println();
	}
	public static void main(String args[])throws IOException
	{
        BufferedReader br=new BufferedReader(new InputStreamReader((System.in)));
        System.out.println("Enter No.Of Elements in the Array?");
        int n=Integer.parseInt(br.readLine());
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.printf("Enter arr[%d] element? ",(i+1));
            arr[i]=Integer.parseInt(br.readLine());
        }
		System.out.println("Given Array");
		printArray(arr);
		mergesrt ob = new mergesrt();
		ob.sort(arr, 0, arr.length - 1);
		System.out.println("\nSorted array");
		printArray(arr);
	}
}