import java.util.*;
class for6
{
public static void main(String ar[])
{
Scanner ob=new Scanner(System.in);
System.out.print("ENTER NAME:");
String name=ob.next();
   int size=name.length();
      String s="";
for(int i=0; i<=size; i++)
{
      char b=name.charAt(i);
s+=b;
System.out.println(s);
}
}
}