package array;

import java.util.Scanner;
/*8 Java program to count numbers of even and odd elements in an array*/

public class Even_odd_arr_assign8
{

	public static void main(String[] args)
	{
int a[];
		a = new int[5];
		int even=0,odd=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter array elements");
		for (int i = 0; i < a.length; i++) 
		{
		a[i] = sc.nextInt();
		}
       for (int i = 0; i < a.length; i++) 
		{
       if(a[i]%2==0)
       even++;
       else
       odd++;
		}
	System.out.println("even count in array="+even);	
	System.out.println("odd count in array="+odd);	
	}

}
