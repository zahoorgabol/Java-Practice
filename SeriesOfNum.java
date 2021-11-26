import java.util.*;
class SeriesOfNum
{
public static void main(String ar[])
{
Scanner ob=new Scanner(System.in);
System.out.print("enter number:");
int n=ob.nextInt();
int a=0;
int b=3;
int c=0;
for(int i=1; i<=n; i++)
{
	System.out.println(a);
	c=a+b;
	a=c;
	b+=2;
}
}
}