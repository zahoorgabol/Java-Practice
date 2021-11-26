import java.util.*;
class changeCase2
{
public static void main(String ar[])
{
Scanner ob=new Scanner(System.in);
System.out.print("enter a num:");
String n=ob.next();
int size=n.length();
String s="";
for(int i=1; i<=size-1; i++);
{
    String name=n.toUpperCase();
    s+=name;

    System.out.print(s);
}}
}