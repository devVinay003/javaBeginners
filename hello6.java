class hello6
{
public static void main(String[] args) {
    int sum=0;
    for(int i=1; i<=20 ; i++)
    {
     if(i%2==0)
     sum=sum+i ;
     else
     continue;
    }
    System.out.println("sum of thr even number from 1 to 20 is "+sum);
} 
}