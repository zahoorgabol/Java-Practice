import java.util.*;
class ForLoopFac
{
public static void main(String ar[])
{
	Scanner ob=new Scanner(System.in);
	System.out.print("enter fact:");
	int n=ob.nextInt();
      int  fact=1;
	for (int i=0; i<=n ; i++)
	 
		 fact+=i*fact;
	 
	 System.out.println(fact);
	 
}
}