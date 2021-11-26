import java.util.*;
class alphabet
{public static void main(String ar[])
{
Scanner ob=new Scanner(System.in);
System.out.print("Enter an alphabet sign");
String al=ob.next();
if(al.equalsIgnoreCase("A"))
System.out.print("A for apple");
if(al.equalsIgnoreCase("B"))
System.out.print("B for bat");
if(al.equalsIgnoreCase("c"))
System.out.print("c for cat");
else
System.out.print("invalid");
}

}