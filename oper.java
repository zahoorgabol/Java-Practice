import java.util.*;
class oper
{
public static void main(String ar[])
{
Scanner a=new Scanner(System.in);
System.out.print("enter 1st value: " );
int no1=a.nextInt();
System.out.print("enter 2nd value:");
int no2=a.nextInt();
System.out.print("enter operator");
String op=a.next();

if(op.equals("/") || op.equals("\\") || op.equals("%"))    //suppose these operators are used to perform division
System.out.print("the division is: " + (no1/no2));
if (op.equals("x") || op.equals("*"))
System.out.print("Multiplication is: " + (no1*no2));  // and these for multiplication
}
}