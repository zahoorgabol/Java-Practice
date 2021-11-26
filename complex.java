import java.util.*;
class Complex
{
public static void main(String r[])
{
Scanner ob=new Scanner (System.in); 
System.out.print("enter the days:");
int day=ob.nextInt();
int year=day/365;
int rd=day%365;
int w=rd/7;
int days=rd%7;


System.out.println("year:"+year);


System.out.println("remaining weeks:"+w);


System.out.println("days: " + days);
}
}