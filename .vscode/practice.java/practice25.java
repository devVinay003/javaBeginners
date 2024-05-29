import java.util.Arrays;
import java.util.Scanner;
public class practice25 {
    
    public static void main(String[]args){
        int a[]=new int [5];
        Scanner r= new Scanner(System.in);
        System.out.println("Enter elements of the array");
        for(int i = 0; i<a.length;i++)
        {
            a [i]=r.nextInt();
        }
        System.out.println("Arrays of elements");
        Object sum;
        for(int i = 0; i<a.length;i++)
        {
        System.out.println(a[i]+" ");
        sum=a[i]+sum;
    }
        System.out.println("\nAddition of array elementss"+sum);

    }
}
