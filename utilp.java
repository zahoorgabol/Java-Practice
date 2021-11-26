import java.util.*;
class Utilp
{
public static void main(String ar[])
{
Scanner a=new Scanner(System.in);
System.out.print ("enter the seconds: ");
int sec=a.nextInt();
int hour=sec/3600;
int rs=sec%3600;
int mint=rs/60;
int rss=rs%60;
System.out.println("hours:" + hour);
System.out.println("minutes: " + mint);
System.out.println(" Remaining seconds: " + rss);
}
}                         