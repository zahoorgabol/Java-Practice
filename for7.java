import java.util.*;
class for7
{
public static void main(String ar[])
{
	Scanner ob=new Scanner(System.in);
System.out.print("enter a number: ");
int num=ob.nextInt();
 // int size=num.length();
String s="";
for(int i=0; i<=num; i++)
{
  char a=num.charAt();
	s+=a;
}
	System.out.println(s);
}
}