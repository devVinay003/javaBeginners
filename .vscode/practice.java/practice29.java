public class practice29
{
public static void main(String[] args)
{
int rows = 5;
for (int i = 1; i <= rows; i++)
{
for (int j = 1; j <= i; j++)
{
System.out.print("*");
}
if (i > 2)
{
System.out.print(" ");
}
System.out.println();
}
}
}