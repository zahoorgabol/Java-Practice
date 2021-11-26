import java.util.*;
class WhileLoopPyramid2
{
public static void main(String ar[])
{
	Scanner ob=new Scanner(System.in);
	String s="";
while(s=="yes" || s=="YES" || s=="Yes")
{
	System.out.print("Enter a number:");
	int n=ob.nextInt();
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
	System.out.print("want more pyramids, type: Yes or No");
	 s=ob.next();
}
}
}