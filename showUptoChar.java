import java.util.*;
class showUptoChar
{
public static void main(String ar[])
{
Scanner ob=new Scanner(System.in);
System.out.print("enter a character:");

int n=ob.nextInt();
char ch='A';

String s="";
for(int i=1; i<=n; i++)
{
	
	ch++;
	System.out.println(ch);
}
}
}