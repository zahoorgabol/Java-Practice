import java.util.*;
class WhileLoopTable2
{
	public static void main(String ar[])
	{
		char ch='y';
		while(ch=='y' || ch=='Y')
		{
		Scanner ob=new Scanner(System.in);
		System.out.print("enter last table No: ");
		int a=ob.nextInt();
		System.out.print("enter counter No: ");
		int b=ob.nextInt();
		int i=1;
		while (i<=a)
		
		{
			int j=1;
			while(j<=b) 
			{				
			System.out.println(i+"*"+j+"="+i*j);
			j++;
			}
		System.out.println();
		i++;
		}
		System.out.print("do you want more table: y/n");
		ch=ob.next().charAt(0);
		
	}
}
}