import java.util.*;
class forloop5
{
public static void main (String ar[])
{
Scanner ob=new Scanner(System.in);
int a=ob.nextInt();
for (int i=1; i<=a; i++)
{
for (int j=1; j<=i; j++)
{
System.out.print("*");
}
System.out.println();
}
}
}