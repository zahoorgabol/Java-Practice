import java.util.*;
class WtoM
{
public static void main(String ar[])
{
Scanner ob=new Scanner (System.in);

System.out.print ("enter the weeks:");
int week=ob.nextInt();
int month=week/4;
int rw=week%4;
System.out.println("months:"+ month);
System.out.println("remaining weekss:" + rw);
}}