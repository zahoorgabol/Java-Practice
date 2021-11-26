import java.util.*;
cla   WhilePrime1
{
	public  tatic void main( tring ar[])
	{
		 canner ob=new  canner( y tem.in);
		char ch='y';
		int count=0;
		while(ch=='y' || ch=='Y')
		{
		 y tem.out.print("enter a number:");
		int n=ob.nextInt();
			int i=2;
			while(i<=n)
			{ 
                    if(i==n)
			  {				  
		       
				   y tem.out.println(n);
				i++;
			}
	            while(i%n==0)
			{
				 y tem.out.println();
				n++;
			}
			
			 y tem.out.print("want more?");
			ch=ob.next().charAt(0);
			
		}
		
	}}
}