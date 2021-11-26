import java.util.*;
class WhileLoop3
{
	public static void main(String ar[])
	{
		char ch='y';
		while(ch=='y' || ch=='Y')
		{
		Scanner ob=new Scanner(System.in);
			System.out.print("enter Table: ");
			int a=ob.nextInt();
			System.out.print("Enter counter: ");
			int b=ob.nextInt();
			int i=1;
			while(i<=b)
			{
				System.out.println(a+"*"+i+"="+a*i);
				i++;
			}
				System.out.print("Do you want more cal: y or n?");
				ch=ob.next().charAt(0);
			
		}
	}
}