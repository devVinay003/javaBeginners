import java.util.Scanner;
public class practice20 {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        
        int number =0;
        do{
           System.out.println("input the number");
           number=sc.nextInt();
           System.out.println("your number is");
           System.out.println(number);
        }  while (number >1);

           System.out.println("BYE BYE");
    }
    
}
