import java.util.*;
class PyramidOfLetters
{
public static void main(String ar[])
{
Scanner ob=new Scanner(System.in);
System.out.print("enter a String:");
String s1=ob.nextLine();
char s2[]=new char [s1.length()];
for(int i=0; i<s1.length(); i++)
{
	 s2[i]=s1.charAt(i);
}
	for(int i=s2.length-1; i>=0; i--)
	{
		for(int j=0; j<=i; j++)
  {
              System.out.print(s2[j]);
		}
		System.out.println();
}
}
}
