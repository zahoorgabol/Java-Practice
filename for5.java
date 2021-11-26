import java.util.*;
class for5
{
public static void main(String ae[])
{
	Scanner ob=new Scanner(System.in);
	System.out.print("enter a name:");
	String name=ob.next();
	int size=name.length();
 String s="";

	for(int i=0; i<size; i++)
	{
	char j=name.charAt(i);
 s+=j;
		
System.out.println(s);
	}
}}
