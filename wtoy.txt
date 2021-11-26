import java.util.*;
class WtoY
{
public static void main(String ar[])
{
Scanner ob=new Scanner (System.in);

System.out.print ("enter the weeks:");
int week=ob.nextInt();
int year=week/52;
int rw=week%52;
System.out.println("years:"+ year);
System.out.println("remaining weekss:" + rw);
}}