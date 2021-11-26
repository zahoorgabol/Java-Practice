import java.util.*;
class N3
{
public static void main(String sr[])
{
Scanner ob=new Scanner(System.in);
System.out.print("enter any number: " );
int a=ob.nextInt();

for(int i=1; i<=a; i++)
{

	for (int j=0; j<=a-i; j++)
	{
		
	System.out.print("*");
	
	}
	System.out.println();
}
}}

