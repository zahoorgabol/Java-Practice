import java.util.*;
class NamePattern
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		String s1=s.nextLine();
		
		char ch[]=new char[s1.length()];
		
		for(int i=0;i<s1.length();i++)
		{
			ch[i]=s1.charAt(i);
		}
		for(int i=ch.length-1;i>=0;i--)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(ch[j]);
			}
			System.out.println();
		}
	}
}