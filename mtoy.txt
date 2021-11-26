import java.util.*;
class MtoY
{
public static void main(String ar[])
{
Scanner ob=new Scanner (System.in);

System.out.println ("enter the months:");
int month=ob.nextInt();
int year=month/12;
int rm=month%12;
System.out.println("year:"+year);
System.out.println("remaining months:" + rm);
}}