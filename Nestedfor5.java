import java.util.*;
class Nestedfor5
{
	public static void main(String  ar[])
	{
		Scanner ob=new Scanner(System.in);
		String name=ob.next();
		int l=name.length();
	     String s="";
	 {
		for(int i=1; i<=l; i++)
	   {
		   for (int j=1; j<=l; j++)
		{	
			char ch=name.charAt(j++);
		    s+=ch;
		System.out.println(s);    
}}}}}
	  