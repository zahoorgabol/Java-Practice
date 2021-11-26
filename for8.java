import java.util.*;
class for8
{
public static void main(String ar[])
{
Scanner ob=new Scanner(System.in);
System.out.print("enter a name: " );
String a=ob.next();
int size=a.length();
String s="";
for(int i=-2; i<=size; i++)
{
	char j=a.charAt(i);
	s+=j;
	System.out.println(s);
}
}
}
