package array;
import java.util.Arrays;
class ArrayRotation_assign9
{  
// programe for clockwise roration    
public static void rotateRight(int array[], int r, int n)   
{   
for (int i = 0; i < r; i++)   
{
 rotate_last_to_1st(array, n); 
}
}    
public static void rotate_last_to_1st(int array[], int n)   
{   
int i, temp;   
temp = array[n - 1];   
for (i = n-1; i > 0; i--)   
{
array[i] = array[i - 1];       
array[0] = temp;  
}
}   

 // programe for anticlockwise rotation 
public static void rotateLeft(int array[], int r, int n)  
{   
for (int i = 0; i < r; i++)  
{
rotate_1st_to_last(array, n);   
}
}   
public static void rotate_1st_to_last(int array[], int n)   
{   
int i, temp;   
temp = array[0];   
for (i = 0; i < n - 1; i++)   
array[i] = array[i + 1];  
array[i] = temp;   
}   
public static void main(String args[])   
{   
int array[] = { 11, 22, 33, 44, 55, 66, 77 };   
 int r = 1;  //no of times rotation
int n = array.length;  
System.out.println("Array before rotation: ");   
System.out.println(Arrays.toString(array)); 
rotateLeft(array, r, n);   //anticlockwise
System.out.println("Array after left rotation: ");   
System.out.println(Arrays.toString(array)); 
rotateRight(array, r, n);
System.out.println("Array after right rotation: ");
System.out.println(Arrays.toString(array)); 
}   
}  

