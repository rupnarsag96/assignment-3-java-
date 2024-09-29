package array;
import java.util.Arrays;

class assend_dessend_assign7
{

static void printOrder(int[] arr, int n)
{
    Arrays.sort(arr);
    for (int i = 0; i < n / 2; i++) 
		System.out.print(arr[i]+" ");
    for (int j = n - 1; j >= n / 2; j--)
	System.out.print(arr[j]+" ");
}


public static void main(String[] args)
{
	int[] arr = { 1, 90, 34, 89, 7, 9 };
	int n = arr.length;
	System.out.println("array before process");
	System.out.println(Arrays.toString(arr));
	System.out.println("array after process");
	printOrder(arr, n);

}
}

