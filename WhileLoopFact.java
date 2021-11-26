import java.util.*;
class WhileLoopFact
{
	public static void main(String ar[])
	{
		Scanner ob=new Scanner(System.in);
		System.out.print("enter num: ");
		int a=ob.nextInt();
		char ch2='y';
	while(ch2=='y' || ch2=='Y')
	{
		int i=1; int fact=1;
	      int num=a;
		while(a>=1)
		{
			fact+=fact*a;
			System.out.println(fact);
		}
	}
	
	}}