package array;
import java.util.Arrays;
public class reversearray_assign2 {

	public static void main(String[] args) 
	{
		int a[]= {1,2,3,5,8,7,9};
	        int start=0;
		int end=a.length-1;
		
         System.out.println(" reverse array");
         while(start<end)
         {
        	 int temp=a[start];
        	 a[start]=a[end];
        	 a[end]=temp;
        	 start++;
        	 end--;
        	
         }
        
         System.out.println(Arrays.toString(a)); 	 

		}
	}


