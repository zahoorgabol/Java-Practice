import java.util.*;
class loopss
{
	public static void main(String args[])
	{
		Scanner ob=new Scanner(System.in);
		System.out.print("Enter any number:");
		int num=ob.nextInt();
           System.out.print("No." +"  "+ "Square");
		for(int i=1; i<=num; i++)
		{
			System.out.print( "\n"+ i+"       " + i*i);
		}
	}
}