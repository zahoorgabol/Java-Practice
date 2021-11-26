import java.util.*;
class Nestedfor4pyramid
{
public static void main(String ar[])
{
Scanner ob=new Scanner(System.in);
System.out.print("enter any number:");
int a=ob.nextInt();
for (int i=1; i<=a; i++)
{
for(int j=1; j<=a-i; j++)
{
System.out.print(j);
}
System.out.println();
}
}
}