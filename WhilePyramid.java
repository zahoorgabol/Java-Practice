import java.util.*;
class WhilePyramid
{
public static void main(String ar[])
{  
	Scanner ob=new Scanner(System.in);
	int n=ob.nextInt();
   char ch='y';
 while( ch=='y' || ch=='Y')
 {
	System.out.print("enter no:");
	int i=1;
	while(i<=n)
	{
		int j=n;
		while(j>=i)
		{
			System.out.print("*");
			j--;
		}
		System.out.println();
		n--;
	}
 }

		System.out.print("want more:");
		ch=ob.next().charAt(0);
}	
}
