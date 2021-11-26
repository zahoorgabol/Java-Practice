import java.util.*;
class WhileLoopPyramid
{
public static void main(String ar[])
{
	// Scanner ob=new Scanner(System.in);
	System.out.print("enter any number:");
	int n=ob.nextInt();
	int i=1;
	int j=1;
	while(i<=n)
	{
		while(j<=i)
		{
		System.out.println("*");
		j--;
		}
		i++;
	
         System.out.println(" ");
	   i=1;
}}
}