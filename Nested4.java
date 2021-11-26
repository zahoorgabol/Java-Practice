import java.util.*;
class Nested4
{
public static void main(String r[])
{
	Scanner ob=new Scanner(System.in);
	String name=ob.next();
	int l=name.length();
	  String s="";
	for(int i=l-1; i>=0; i--)
	{
		for(int j=0; j<=i; j++)
		{
			char ch=name.charAt(j);
		
			  s+=ch;
			
			System.out.println(s);
		}
	}
}
}