import java.util.*;
class showLetters1
{
public static void main(String ar[])
{
	Scanner ob=new Scanner (System.in);
	System.out.print("enter a number: ");
	String num=ob.next();
	int size=num.length();
	String s="";
	for(int i=1; i>=size; i++)
	{
		char j=num.charAt(i);
		s+=j;
		System.out.println(s);
	}
}
}
 