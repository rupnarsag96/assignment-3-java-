package array;
6.    Program to check Harshad number or not using Java
Hint: - Harshad number is a number or an integer in base 
10 which is completely divisible by sum of its digits.
Example: Suppose a number 24. Calculate the sum of digits
of the number   (2 + 4) = 6 .Check whether the number entered 
by user is completely divisible by    sum of its digits or not.*/

import java.util.Scanner;

public class Harshad_no_assign6 
{

	public static void main(String[] args)
	{
         int n,sum=0,temp,rem;
         Scanner sc = new Scanner(System.in);
         System.out.println("enter no");
         n=sc.nextInt();
         temp=n;
         while(n>0)
         {
          rem=n%10;
          sum=sum+rem;
           n=n/10;
          }
         System.out.println("sum of digits "+sum);
         if(temp%sum==0)
         System.out.println("Harshad number ");
	 else
         System.out.println("Not Harshad number ");

	}

}
