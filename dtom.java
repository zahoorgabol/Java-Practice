import java.util.*;
class DtoM
{
public static void main(String ar[])
{
Scanner ob=new Scanner (System.in);

System.out.println ("enter the days:");
int day=ob.nextInt();
int month=day/30;
int rd=day%30;
System.out.println("months:"+ month);
System.out.println("remaining days:" + rd);
}}