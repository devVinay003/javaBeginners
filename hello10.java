import java .util.Scanner;
class java10
{
    public static void main(String[] args) 
    {
        int num,count = 0;
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        for (int i=2;i<=num;i++)
    {
        if (num%i==0)
        count++;
        else
        continue;
    }
    if (count==1)
    System.out.println(num+"is prime number");
    else
    System.out.println(num+" is not a prime number");

    }
}
