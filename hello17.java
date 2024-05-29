import java.util.Arrays;
import java.util.Collections; 
import java.util.Scanner;

public class hello17
{ 
    public static void main(String[] args) 
    { 
        
         @SuppressWarnings("resource")
        Scanner sc=new Scanner(System.in);
         System.out.println("Enter the number of elements ");
         Integer n=sc.nextInt();
         System.out.println("Enter the array elements ");
         Integer[] arr=new Integer[n];
         for(int i=0;i<n;i++)
         {
             arr[i]=sc.nextInt();
         }
 
        
        System.out.printf("Original Array:",Arrays.toString(arr)); 
        Arrays.sort(arr, Collections.reverseOrder()); 
 
        System.out.printf("Sorted Array:", 
               Arrays.toString(arr)); 
    } 
}