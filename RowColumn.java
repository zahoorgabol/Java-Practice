import java.util.*;
class RowColumn
{
	public static void main(String ar[])
	{
		Scanner ob=new Scanner(System.in);
		System.out.print("Enter Rows:");
		int r=ob.nextInt();
		System.out.print("enter Columns:");
		int c=ob.nextInt();
		for(int i=1; i<=r; i++)
		{
			for(int j=1; j<=c; j++)
			{
				System.out.print("*");
		}
		System.out.println();
	}
}}
