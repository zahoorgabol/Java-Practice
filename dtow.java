import java.util.*;
class DtoW
{
public static void main(String ar[])
{
Scanner ob=new Scanner (System.in);

System.out.println ("enter the days:");
int day=ob.nextInt();
int week=day/7;
int rd=day%7;
System.out.println("weeks:"+week);
System.out.println("remaining days:" + rd);
}}