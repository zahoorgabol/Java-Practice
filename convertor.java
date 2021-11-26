import java.util.*;
class Convertor
{
public static void main(String arg[])
{
Scanner ob=new Scanner(System.in);
System.out.print("enter feet");
int feet=ob.nextInt();
int inches=feet*12;
System.out.println("inches" + inches);
}
}