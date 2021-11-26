import java.util.*;
class Utilpp
{
public static void main(String ar[])
{
Scanner a=new Scanner(System.in);
System.out.print ("enter the rupees: ");
int rup=a.nextInt();
int ft=rup/5000;
int rr=rup%5000;
int t=rr/1000;
int d=rr%1000;
int fh=d/500;
int rd= d%500;
int h=rd/100;
int rp=rd%100;
int fif=rp/50;
int rs=rp%50;
int twe=rs/20;
int rss=rs%20;
int ten=rss/10;
int rf=rss%10;
int fiv=rf/5;
int rfs=rf%5;
int two=rfs/2;
int rst=rfs%2;


System.out.println("five thousands note:" + ft);
System.out.println("one thousand note: " + t);
System.out.println("five hund  note: " + fh);
System.out.println("hund note:"+ h);
System.out.println("fifty:" + fif);
System.out.println("twenty note:" + twe);
System.out.println("ten rup note: " + ten);
System.out.println("five coin: " + fiv);
System.out.println("two coin: " + two);
System.out.println("one rupee: " + rst);

}
}                         