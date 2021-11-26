import java.util.*;
class StoH
{public static void main (String ar[])
{
Scanner ob=new Scanner(System.in);
System.out.print("enter the total sec: ");
int sec=ob.nextInt();
int hour=sec/3600; 
int rs=sec%3600;
System.out.println("hours are:" + hour);
System.out.print("remaining seconds are: "+ rs);
}
}