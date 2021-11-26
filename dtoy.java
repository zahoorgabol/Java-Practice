import java.util.*;
class DtoY
{
public static void main(String ar[])
{
Scanner ob=new Scanner (System.in);

System.out.println ("enter the days:");
int day=ob.nextInt();
int year=day/365;
int rd=day%365;
System.out.println("years:"+ year);
System.out.println("remaining days:" + rd);
}}