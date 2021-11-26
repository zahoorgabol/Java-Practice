import java.util.*;
class NestedforFact
{
public static void main(String ar[])
{
	Scanner ob=new Scanner(System.in);
	System.out.print("enter fact:");
	int n=ob.nextInt();
       int fact=1;
	 (int i=1; i<=n; i++)
	 {
		 fact+=n*fact;
	 }
	 System.out.print(fact);
	 
}
}