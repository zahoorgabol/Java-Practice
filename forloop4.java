import java.util.*;
class forloop4
{
public static void main (String ar[])
{
Scanner ob=new Scanner(System.in);
System.out.print("Enter any number:");
int a=ob.nextInt();
 
for(int i=1; i<=a; i++)
{
  for(int j=1; j<=i; j++)
{
System.out.print(" Ali ");
}
System.out.println();
}
}
}