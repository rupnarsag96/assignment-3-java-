package array;
import java.util.Scanner;
public class count_no_of_occurence_assign4 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a[]= {1,2,3,3,5,5,5,4,4,4};
		int n;
		System.out.println("enter no which you want to search");
		n=sc.nextInt();
		int count=0;
		for (int i = 0; i < a.length; i++) 
		{
		
		if(a[i]==n)
			count++;

	    }
		System.out.print("occurence of"+n+"is in array is"+count);

	}

}
