import java.util.*;
class PrimeNo
{
	public static void main(String ar[])
	{
		Scanner ob=new Scanner(System.in);
		System.out.print("enter a number:");
		int a=ob.nextInt();
		int g;
		for(int i=0; i<=500; i++)
		{
			for (int j=0; j<=i/a; j++)
			{	
			g+=j;
			}
				System.out.print(g);
		
	}
}
}