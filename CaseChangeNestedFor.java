import java.util.*;
class CaseChangeNestedfor
{
public static void main(String ar[])
{
Scanner ob=new Scanner (System.in);
System.out.print("enter your name:");
String s1=ob.nextLine();
int size=s1.length();

for (int i=0; i<=size; i++)
// {
	// for (int j=size-i; j>=i; i++)
	{
		char ch=s1.charAt(i);
		if(ch<96)
		{
			ch+=32;
		}
		else
		{
			ch-=32;
		}
	
        System.out.println(ch);
	}
// }
}
}