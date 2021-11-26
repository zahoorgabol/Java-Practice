import java.util.*;
class secret
{
public static void main(String ar[])
{
Scanner a=new Scanner(System.in);
System.out.print("enter your secret code:");
String code=a.next();
if (code.equals("jk231") || code.equals("123y5") || code.equals("F56g"))
System.out.print("Welcome sir!");
else
	System.out.print("Sory you are not allowed!");
}
}