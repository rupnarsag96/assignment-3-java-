package array;

import java.util.Scanner;

public class MaxAndAvgOfArray_assign1 {
	public static void main(String[] args) {
		int a[];
		a = new int[5];
		int max = 0, avg, sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter array elements");
		for (int i = 0; i < a.length; i++) {
			// a[i]=new int[];
			a[i] = sc.nextInt();

		}
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max)
				max = a[i];
		}
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
		}
		avg = sum / a.length;
		System.out.println("max" + max);
		System.out.println("sum" + sum);
		System.out.println("avg" + avg);
	}
}
