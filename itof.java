import java.util.*;
class ItoF
{
public static void main(String ar[])
{
Scanner ob=new Scanner (System.in);

System.out.println ("enter the inches:");
int inches=ob.nextInt();
int feet=inches/12;
int remainingInches=inches%12;
System.out.println("feet:"+feet);
System.out.println("inches:" + remainingInches);
}}